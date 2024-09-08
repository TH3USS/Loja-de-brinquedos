package br.com.marysplayhaven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NovoBrinquedoController {
    @GetMapping("/novo-brinquedo")
    public String novoBrinquedo() {
        return "novo-brinquedo";
    }
}
