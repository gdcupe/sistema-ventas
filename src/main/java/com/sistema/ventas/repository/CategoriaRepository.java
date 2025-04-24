package com.sistema.ventas.repository;

import com.sistema.ventas.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    // Buscar categoría por nombre
    Categoria findByNombre(String nombre);

    // Obtener todas las categorías
    List<Categoria> findAll();
}
