package com.weg.iniciandojpa.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "fornecedores")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Fornecedor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Column(name = "nome_fornecedor", nullable = false)
    private String nome;


    @Column(length = 14, nullable = false)
    private int cnpj;



    @Column(name = "contato_fornecedor", nullable = false, length = 12)
    private int telefone;

}
