package com.weg.iniciandojpa.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CollectionId;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "detalhesProdutos")
@Getter
@Setter

public class ProdutoDetalhe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Lob
    @Column(name = "descricao_detalhes")
    private String descricao;


    @Column(name = "peso_produto", nullable = false)
    private double peso;


    @Column(name = "nome_fabricante", nullable = false)
    private String fabricante;
}
