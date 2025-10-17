package com.weg.iniciandojpa.model;


import jakarta.persistence.*;
import lombok.*;

@Entity // fala q é uma entidade, um objeto que representa uma tabela no banco
@AllArgsConstructor // todos os argumentos no construtor
@NoArgsConstructor // construtor vazio -> não tem argumentos
@Getter
@Setter
@Table(name = "usuarios") // refereciação no banco -> cria a tabela

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column( nullable = false)
    private String nome;

    @Column (nullable = false, unique = true)
    private String email;


    @Column(nullable = false)
    private String senha;



    public Usuario(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;

    }






}
