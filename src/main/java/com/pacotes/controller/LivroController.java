package com.pacotes.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pacotes.models.Livro;
import com.pacotes.repository.LivroRepository;

@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;
  
    @PostMapping("/cadastro")
    public void Cadastra(@RequestBody Livro livro){

        this.livroRepository.save(livro);

    }

    @PostMapping("/atualizar")
    public void Atualizar(@RequestBody Livro livro){

        this.livroRepository.save(livro);

    }

    
    @GetMapping("/verLivros")
    public List<Livro> ver(){
        
        return this.livroRepository.findAll();

    }

    @DeleteMapping("/excluir/{id}")
    public void excluir(@PathVariable Long id){

        this.livroRepository.deleteById(id);

    }
    
}