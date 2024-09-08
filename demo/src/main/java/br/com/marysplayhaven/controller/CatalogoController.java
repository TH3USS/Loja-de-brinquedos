package br.com.marysplayhaven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.marysplayhaven.model.Brinquedo;
import br.com.marysplayhaven.service.BrinquedoService;

@Controller
public class CatalogoController {

    @Autowired
    private BrinquedoService brinquedoService;

    @GetMapping("/init")
    public ResponseEntity<String> initDatabase() {
        // Inicializa o banco de dados com 20 produtos
        for (int i = 1; i <= 20; i++) {
            Brinquedo brinquedo = new Brinquedo();
            brinquedo.setNome("Produto " + i);
            brinquedo.setPreco(25.0 * i);
            brinquedo.setImagem("/images/produto" + i + ".jpg"); // ajuste o caminho conforme necessário

            // Adicione mais configurações se necessário

            brinquedoService.adicionarBrinquedo(brinquedo);
        }

        return ResponseEntity.ok("Banco de dados inicializado com sucesso.");
    }
}
