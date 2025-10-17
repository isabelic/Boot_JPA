package com.weg.iniciandojpa.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "departamentos")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_departamento", nullable = false)
    private String nome;



    @Column(nullable = false, name = "abreviacao_nome_departamento")
    private String sigla;

}
