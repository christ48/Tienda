/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.DAo;

/**
 *
 * @author lossa
 */
import com.example.demo.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductoDao extends JpaRepository <Producto,Long> {
    
}
