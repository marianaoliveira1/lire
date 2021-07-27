package com.pacotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pacotes.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String>{

    @Query("SELECT u from Usuario u where u.nome = :nome ")
    public Usuario findUser(@Param("nome") String nome);
    
}