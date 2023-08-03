/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.domain.Especies;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.DAo.EspecieDAO;
import com.example.demo.service.EspeciesService;
import com.example.demo.service.Productoservice;
import java.math.BigDecimal;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * @author lossa
 */
@Controller
@Slf4j

public class FiltroController {
    @Autowired
    private Productoservice productoservice;
    
    @Autowired
     EspecieDAO especieDAO;
    @Autowired
    EspeciesService especiesService;
    
    
   @GetMapping("Filtro")
   public String MostratFiltro(Model model){
       var productos= productoservice.getProductos();
       model.addAttribute("productos", productos);
       return "Filtro";
   }
   @GetMapping("FiltroEspecie")
   public String MostrarFiltro2(Model model){
       var Especies= especiesService.getEspecies();
       model.addAttribute("Especie", Especies);
       return "FiltroEspecie";
   
   }
          

   
   
   @PostMapping("/query1")
public String consultaQuery1(@RequestParam(value="precioInf") BigDecimal precioInf, 
                             @RequestParam(value="precioSup") BigDecimal precioSup, 
                             Model model){
    var productos = productoservice.findByPrecioBetweenOrderByDescripcion(precioInf, precioSup);
    model.addAttribute("productos", productos);
    model.addAttribute("precioInf", precioInf);
    model.addAttribute("precioSup", precioSup);
    return "Filtro";
}

@PostMapping("/query2")
public String consultaQuery2(@RequestParam(value="precioInf") BigDecimal precioInf,
                             @RequestParam(value="precioSup") BigDecimal precioSup, 
                             Model model){
    var productos = productoservice.metodoJPQL(precioInf, precioSup);
    model.addAttribute("productos", productos);
    model.addAttribute("totalProductos", productos.size());
    model.addAttribute("precioInf", precioInf);
    model.addAttribute("precioSup", precioSup);
    return "Filtro";
}


   
}
