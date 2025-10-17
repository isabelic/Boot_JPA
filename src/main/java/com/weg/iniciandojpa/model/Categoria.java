package com.weg.iniciandojpa.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "categorias")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Categoria {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_categoria", nullable = false,length = 50)
    private String nome;

    @Column(name = "descricao_categoria", nullable = false, length = 100)
    private String descricao;

}
