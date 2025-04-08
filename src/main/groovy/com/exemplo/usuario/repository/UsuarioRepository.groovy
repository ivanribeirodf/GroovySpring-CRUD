package com.exemplo.usuario.repository

import com.exemplo.usuario.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String>{

}