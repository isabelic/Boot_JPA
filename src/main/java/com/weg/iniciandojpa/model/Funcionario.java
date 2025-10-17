package com.weg.iniciandojpa.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "funcionarios")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nome;


    @Column(name = "folha_pagamento",nullable = false,  scale = 2)
    private double salario;



    @Column(name = "estaAtivo", nullable = false)
    private boolean FuncEstaAtivo;

}
