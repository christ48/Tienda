/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.DAo;

/**
 *
 * @author lossa
 */
import com.example.demo.domain.Proveedores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProveedorDao extends JpaRepository <Proveedores,Long> {
    
}
