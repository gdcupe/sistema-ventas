package com.sistema.ventas.repository;

import com.sistema.ventas.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    // Buscar cliente por nombre o apellido (útil para búsqueda rápida)
    List<Cliente> findByNombresContainingOrApellidosContaining(String nombres, String apellidos);

    // Buscar cliente por email
    Cliente findByEmail(String email);
}
