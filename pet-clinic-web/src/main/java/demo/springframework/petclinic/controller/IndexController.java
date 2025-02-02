package demo.springframework.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping(value = { "", "/", "index", "index.html" })
    public String index() {
        return "index";
    }

    @GetMapping(value = "/oups")
    public String workInProgress() {
        return "wip";
    }
}
