/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author lossa
 */
@Data
@Entity
@Table(name = "Especies")
public class Especies implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long idEspecie;
    
    @Column(name = "Nombre")
    private String Nombre;
    
    @Column(name = "Descripcion")
    private String Descripcion;
    
    @Column(name = "Habitat")
    private String Habitat;
    
    @Column(name="Tamaño")
    private String Tamano;
    
    @Column(name="Familia")
    private String Familia;
    
    @Column(name="id_proveedor")
    private int id_proveedor;
    
    public Especies(){}
    
    public Especies(String Nombre,String Descripcion,String Habitat,String Tamano, String Familia,int id_proveedor){
        this.Nombre=Nombre;
        this.Descripcion=Descripcion;
        this.Habitat=Habitat;
        this.Tamano=Tamano;
        this.Familia=Familia;
        this.id_proveedor=id_proveedor;
    
    
    }
    
}
