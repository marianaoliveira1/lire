package com.pacotes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pacotes.models.Biblioteca;

public interface BibliotecaRepository extends JpaRepository<Biblioteca, Long>{

    @Query("SELECT u from Biblioteca u where u.nome = :nome")
    public List<Biblioteca> findMyBooks(@Param("nome") String nome);

}