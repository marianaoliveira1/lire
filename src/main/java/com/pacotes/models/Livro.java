package com.pacotes.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Livro")
public class Livro {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "capa")
    private String capa;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "sinopse")
    private String sinopse;
    @Column(name = "genero")
    private String genero;
    @Column(name = "etiquetas")
    private String etiquetas;
    @Column(name = "classificacao")
    private String classificacao;
    @Column(name = "autor")
    private String autor;

    
}