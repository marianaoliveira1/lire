package com.pacotes.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "Usuario")
public class Usuario {
    
    @Id
    private String nome;
    @Column(name = "email")
    private String email;
    @Column(name = "senha")
    private String senha;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "genero")
    private String genero;
    @Column(name = "foto")
    private String foto;

}
