/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

/**
 *
 * @author lossa
 */

import com.example.demo.domain.Especies;
import com.example.demo.domain.Producto;
import java.math.BigDecimal;
import java.util.List;

public interface Productoservice {

    List<Producto> getProductos();

    Producto getProducto(Long idProducto);

    void saveProducto(Producto producto);

    void deleteProducto(Long idProducto);

    void updateProducto(Producto producto);
    
    List<Producto>  findByPrecioBetweenOrderByDescripcion(BigDecimal precioInf, BigDecimal precioSup);
    
    public List<Producto> metodoJPQL(BigDecimal precioInf, BigDecimal precioSup);
   
    public List<Producto> metodoNativo(BigDecimal precioInf, BigDecimal precioSup);
   
}
