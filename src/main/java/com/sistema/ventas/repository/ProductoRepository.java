package com.sistema.ventas.repository;

import com.sistema.ventas.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    // Buscar productos por categoría
    List<Producto> findByCategoriaId(Long categoriaId);

    // Buscar productos por nombre (útil para la búsqueda rápida)
    List<Producto> findByNombreContaining(String nombre);

    // Actualizar el stock de un producto después de una venta
    @Modifying
    @Query("UPDATE Producto p SET p.stock = p.stock - :cantidad WHERE p.id = :productoId")
    void updateStock(@Param("productoId") Long productoId, @Param("cantidad") Integer cantidad);
}
