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

import com.pacotes.models.Capitulo;
import com.pacotes.repository.CapituloRepository;

@RestController
@RequestMapping("/capitulo")
public class CapituloController {

    @Autowired
    private CapituloRepository capituloRepository;
  
    @PostMapping("/cadastro")
    public void Cadastra(@RequestBody Capitulo capitulo){

        this.capituloRepository.save(capitulo);

    }

    @PostMapping("/atualizar")
    public void Atualizar(@RequestBody Capitulo capitulo){

        this.capituloRepository.save(capitulo);

    }

    @GetMapping("/verCapitulos")
    public List<Capitulo> verCapitulos(){
        
        return this.capituloRepository.findAll();

    }

    @DeleteMapping("/excluir/{id}")
    public void excluir(@PathVariable Long id){

        this.capituloRepository.deleteById(id);

    }

}