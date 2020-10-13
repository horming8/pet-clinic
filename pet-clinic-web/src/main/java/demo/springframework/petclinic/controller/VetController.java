package demo.springframework.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.springframework.petclinic.service.VetService;

@RequestMapping("/vet")
@Controller
public class VetController {

    private VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping(value = { "", "/", "/index", "/index.html" })
    public String index(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vet/index";
    }
}
