package com.sistema.ventas.repository;

import com.sistema.ventas.entity.Rol;
import com.sistema.ventas.entity.Usuario;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Buscar usuario por nombre de usuario (útil para el login)
    Usuario findByUsername(String username);

    // Buscar usuarios por rol (ADMIN, VENDEDOR)
    List<Usuario> findByRol(Rol rol);
}
