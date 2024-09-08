package br.com.marysplayhaven.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.marysplayhaven.model.Brinquedo;
import br.com.marysplayhaven.repository.BrinquedoRepository;

@Service
public class BrinquedoServiceImpl implements BrinquedoService {

    private final BrinquedoRepository brinquedoRepository;

    public BrinquedoServiceImpl(BrinquedoRepository brinquedoRepository) {
        this.brinquedoRepository = brinquedoRepository;
    }

    @Override
    public List<Brinquedo> listarBrinquedos() {
        return brinquedoRepository.findAll();
    }

    @Override
    public Brinquedo obterBrinquedoPorId(Long id) {
        Optional<Brinquedo> optionalBrinquedo = brinquedoRepository.findById(id);
        return optionalBrinquedo.orElse(null);
    }

    @Override
    public Brinquedo adicionarBrinquedo(Brinquedo brinquedo) {
        return brinquedoRepository.save(brinquedo);
    }

    @Override
    public Brinquedo atualizarBrinquedo(Long id, Brinquedo brinquedo) {
        Optional<Brinquedo> existingBrinquedo = brinquedoRepository.findById(id);
        if (existingBrinquedo.isPresent()) {
            Brinquedo updatedBrinquedo = existingBrinquedo.get();
            updatedBrinquedo.setNome(brinquedo.getNome());
            updatedBrinquedo.setPreco(brinquedo.getPreco());
            updatedBrinquedo.setImagem(brinquedo.getImagem());
            updatedBrinquedo.setMarca(brinquedo.getMarca());
            updatedBrinquedo.setDescricao(brinquedo.getDescricao());
            updatedBrinquedo.setBeneficios(brinquedo.getBeneficios());
            updatedBrinquedo.setCategorias(brinquedo.getCategorias());

            return brinquedoRepository.save(updatedBrinquedo);
        }
        // Se não encontrar o brinquedo, pode retornar null ou lançar uma exceção
        return null;
    }

    @Override
    public void excluirBrinquedo(Long id) {
        brinquedoRepository.deleteById(id);
    }
}
