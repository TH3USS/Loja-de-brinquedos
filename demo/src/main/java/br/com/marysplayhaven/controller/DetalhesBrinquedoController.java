package br.com.marysplayhaven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DetalhesBrinquedoController {
    @GetMapping("/detalhes")
    public String detalhesBrinquedo() {
        return "detalhes-brinquedo";
    }
}
