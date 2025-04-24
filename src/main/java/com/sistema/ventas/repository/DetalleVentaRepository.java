package com.sistema.ventas.repository;

import com.sistema.ventas.entity.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long> {

    // Obtener todos los productos vendidos en una venta específica
    List<DetalleVenta> findByVentaId(Long ventaId);

    // Obtener todas las ventas de un producto
    List<DetalleVenta> findByProductoId(Long productoId);
}
