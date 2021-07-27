package com.pacotes.models;

import org.w3c.dom.Text;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "Capitulo")
public class Capitulo {
    //adicionar, pesquisa (id, id_livro), excluir, atualizar
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "id_livro")
    private Long id_livro;
    @Column(name = "capitulo")
    private String capitulo;
    @Column(name = "foto")
    private String foto;
    @Column(name = "texto")
    private String texto;
    @Column(name = "status")
    private int status;

}