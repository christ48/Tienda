/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.domain.Producto;
import com.example.demo.service.Productoservice;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


/**
 *
 * @author lossa
 */
@Controller
@Slf4j

public class ControllerProducto {
    
    @Autowired
    private Productoservice productoservice;

    @GetMapping("Producto")
    public String mostrarProductos(Model model) {
        List<Producto> productos = productoservice.getProductos();
        model.addAttribute("productos", productos);
        model.addAttribute("totalProductos", productos.size());
        return "Producto";
    }
    
   @GetMapping("/nuevo")
    public String productoNuevo(Producto producto) {
        return "modifica"; 
    }

    @PostMapping("/producto/guardar")
    public String productoGuardar(Producto producto) {
        productoservice.saveProducto(producto);
        return "redirect:/Producto";
    }
    @PostMapping("/guardar")
    public String ProductoActulizar(Producto producto){
        productoservice.saveProducto(producto);
        return"redirect:/Producto";
    }

    @GetMapping("/eliminar/{idProducto}")
    public String productoEliminar(@PathVariable("idProducto") Long idProducto) {
        productoservice.deleteProducto(idProducto);
        return "redirect:/Producto";
    }

    @GetMapping("/modifica/{idProducto}")
    public String productoModificar(@PathVariable("idProducto") Long idProducto, Model model) {
        Producto producto = productoservice.getProducto(idProducto);
        model.addAttribute("producto", producto); 
        return "modifica"; 
    }

}
