package com.pacotes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pacotes.models.Capitulo;

public interface CapituloRepository extends JpaRepository<Capitulo, Long>{

    @Query("SELECT u from Capitulo u where u.id_livro = :id_livro")
    public List<Capitulo> findByCap(@Param("id_livro") Long id_livro);
    

}