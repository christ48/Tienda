/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

/**
 *
 * @author lossa
 */
import com.example.demo.domain.Proveedores;

import com.example.demo.service.ProveedorService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ProveedorController {
     @Autowired
     ProveedorService proveedorService;
     
     @GetMapping("Proveedores")
     public String MostrarProveedores(Model model){
     List<Proveedores> proveedores=proveedorService.getProveedores();
     model.addAttribute("Proveedores",proveedores);
     model.addAttribute("TotalProveedores",proveedores.size());
     return "Proveedores";
     
     }
     @PostMapping("/nuevoProveedor")
     public String guardarProveedor(Proveedores proveedores){
         proveedorService.SaveProveedor(proveedores);
         return"redirect:/Proveedores";
     }
     @GetMapping("/eliminarProveedor/{id}")
     public String EliminarProveedor(@PathVariable("id") Long id){
         proveedorService.DeleteProveedor(id);
         return "redirect:/Proveedores";
     
     }
     @GetMapping("/ModificarProveedor/{id}")
     public String modificarProveedor(@PathVariable("id")Long id, Model model){
            Proveedores proveedores=proveedorService.getProvedor(id);
            model.addAttribute("Proveedores",proveedores);
            return"ModificarProveedor";
        }
     
     
     @PostMapping("/ActulizarProveedor")
     public String actualizarProveedor(Proveedores proveedores){
         proveedorService.UpdateProveedor(proveedores);
         return"redirect:/Proveedores";
     
     }
    
}
