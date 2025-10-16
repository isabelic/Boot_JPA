package com.weg.iniciandojpa.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "pedidos")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Pedido {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private LocalDate dataPedido;


    @Column(nullable = false)
    private double valorTotal;


    @Enumerated(EnumType.STRING)
    private String status;
}
