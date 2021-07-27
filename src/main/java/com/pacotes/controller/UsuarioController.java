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

import com.pacotes.models.Usuario;
import com.pacotes.repository.UsuarioRepository;
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;
  
    @PostMapping("/cadastro")
    public void Cadastra(@RequestBody Usuario usuario){

        this.usuarioRepository.save(usuario);

    }

    @PostMapping("/atualizar")
    public void Atualizar(@RequestBody Usuario usuario){

        this.usuarioRepository.save(usuario);

    }

    @GetMapping("/verUsuario/{nome}")
    public Usuario verUsuario(@PathVariable("nome") String nome){
        
        return this.usuarioRepository.findUser(nome);

    }

    @GetMapping("/verUsuarios")
    public List<Usuario> verUsuarios(){
        
        return this.usuarioRepository.findAll();

    }

    @DeleteMapping("/excluir/{nome}")
    public void excluir(@PathVariable String nome){

        this.usuarioRepository.deleteById(nome);

    }

}