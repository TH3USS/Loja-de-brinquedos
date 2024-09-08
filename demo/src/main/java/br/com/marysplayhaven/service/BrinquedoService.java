package br.com.marysplayhaven.service;

import java.util.List;

import br.com.marysplayhaven.model.Brinquedo;

public interface BrinquedoService {
    
    List<Brinquedo> listarBrinquedos();
    
    Brinquedo obterBrinquedoPorId(Long id);
    
    Brinquedo adicionarBrinquedo(Brinquedo brinquedo);
    
    Brinquedo atualizarBrinquedo(Long id, Brinquedo brinquedo);
    
    void excluirBrinquedo(Long id);
}
