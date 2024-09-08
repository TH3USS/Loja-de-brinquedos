package br.com.marysplayhaven.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marysplayhaven.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    // Métodos específicos, se necessário
}
