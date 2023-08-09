/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

/**
 *
 * @author lossa
 */
import com.example.demo.domain.Proveedores;
import java.util.List;
public interface ProveedorService {
    List<Proveedores> getProveedores();
    
    Proveedores getProvedor(Long id);
    
    void SaveProveedor(Proveedores proveedores);
    
    void DeleteProveedor(Long id);
    
    void UpdateProveedor(Proveedores proveedores);
    
    
    
}
