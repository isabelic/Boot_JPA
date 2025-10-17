package com.weg.iniciandojpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "produtos")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Produto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private String nome;

    @Column( scale = 2, nullable = false)
    private Double preco;



    @Column(nullable = false)
    private int estoque;


}
