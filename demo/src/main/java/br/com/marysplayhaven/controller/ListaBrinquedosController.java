package br.com.marysplayhaven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListaBrinquedosController {
    @GetMapping("/lista-brinquedos")
    public String listaBrinquedos() {
        return "lista-brinquedos";
    }
}
