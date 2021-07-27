package com.pacotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pacotes.models.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

    
}