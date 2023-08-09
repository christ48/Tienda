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
import lombok.Data;

/**
 *
 * @author lossa
 */
@Data
@Entity
@Table(name = "Proveedores")
public class Proveedores {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    
    @Column(name="Nombre")
    private String Nombre;
    
    @Column(name="Direccion")
    private String Direccion;
    
    @Column(name="Telefono")
    private String Telefono;
    
    @Column(name="Email")
    private String Email;
    
    public Proveedores(){}
    
    public Proveedores(String Nombre,String Direccion,String Telefono,String Email){
    this.Nombre=Nombre;
    this.Direccion=Direccion;
    this.Telefono=Telefono;
    this.Email=Email;
    
    }
    
    
}
