package demo.springframework.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vet")
@Controller
public class VetController {

    @GetMapping(value = { "", "/", "/index", "/index.html" })
    public String index() {
        return "vet/index";
    }
}
