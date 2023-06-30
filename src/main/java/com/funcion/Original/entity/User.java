package com.funcion.Original.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "registrador")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idregistrador;

    private String correo;

    private String clave;

}
