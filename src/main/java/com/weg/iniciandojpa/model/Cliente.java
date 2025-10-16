package com.weg.iniciandojpa.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "clientes")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = false, length = 11)
    private  int cpf;

    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

}
