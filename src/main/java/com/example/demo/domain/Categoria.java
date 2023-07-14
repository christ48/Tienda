/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.domain;

/**
 *
 * @author lossa
 */
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long ID;
    private String Nombre_categoria;
    private boolean activo;

    public Categoria() {
    }

    public Categoria(String categoria, boolean activo) {
        this.Nombre_categoria = categoria;
        this.activo = activo;
    }
}