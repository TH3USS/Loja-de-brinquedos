package br.com.marysplayhaven.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marysplayhaven.model.Brinquedo;

public interface BrinquedoRepository extends JpaRepository<Brinquedo, Long> {
    // Métodos específicos, se necessário
}
