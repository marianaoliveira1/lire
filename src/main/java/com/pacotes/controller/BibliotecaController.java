package com.pacotes.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pacotes.models.Biblioteca;
import com.pacotes.repository.BibliotecaRepository;

@RestController
@RequestMapping("/biblioteca")
public class BibliotecaController {
  
    @Autowired
    private BibliotecaRepository bibliotecaRepository;
  
    @PostMapping("/cadastro")
    public void Cadastra(@RequestBody Biblioteca biblioteca){

        this.bibliotecaRepository.save(biblioteca);

    }

    @PostMapping("/atualizar")
    public void Atualizar(@RequestBody Biblioteca biblioteca){

        this.bibliotecaRepository.save(biblioteca);

    }

    @GetMapping("/verBiblioteca/{nome}")
    public List<Biblioteca> verBiblioteca(@PathVariable("nome") String nome){
        
        return this.bibliotecaRepository.findMyBooks(nome);

    }

    @GetMapping("/verBibliotecas")
    public List<Biblioteca> verBibliotecas(){
        
        return this.bibliotecaRepository.findAll();

    }

    @DeleteMapping("/excluir/{id}")
    public void excluir(@PathVariable Long id){

        this.bibliotecaRepository.deleteById(id);

    }

    
}