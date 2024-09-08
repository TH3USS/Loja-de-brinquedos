package br.com.marysplayhaven.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marysplayhaven.model.Beneficio;

public interface BeneficioRepository extends JpaRepository<Beneficio, Long> {
    // Métodos específicos, se necessário
}
