package com.sistema.ventas.repository;

import com.sistema.ventas.entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface VentaRepository extends JpaRepository<Venta, Long> {

    // Obtener ventas por cliente (historial de compras de un cliente)
    List<Venta> findByClienteId(Long clienteId);

    // Obtener ventas por rango de fechas (útil para generar reportes)
    List<Venta> findByFechaBetween(Date fechaInicio, Date fechaFin);

    // Obtener total de ventas por cliente
    @Query("SELECT SUM(v.total) FROM Venta v WHERE v.cliente.id = :clienteId")
    BigDecimal obtenerTotalVentasPorCliente(@Param("clienteId") Long clienteId);
}
