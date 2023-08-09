/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import com.example.demo.domain.Especies;
import com.example.demo.service.EspeciesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
public class EspecieController {
     @Autowired
     EspeciesService especiService;
     
     @GetMapping("Especies")
    public String MostrarEspecies(Model model) {
    List<Especies> especies = especiService.getEspecies();
    model.addAttribute("Especie", especies); 
    model.addAttribute("TotalEspecies", especies.size());
    return "Especies";
}

     @PostMapping("/nuevaEspecie")
     public String GuardarEspecie(Especies especie){
         especiService.SaveEspecie(especie);
         return "redirect:/Especies";
     
     }
     @GetMapping("/eliminarEspecie/{idEspecie}")
     public String EleminarEspecie(@PathVariable("idEspecie") Long idEspecie){
         especiService.deleteEspecie(idEspecie);
         return "redirect:/Especies";
     }
     @GetMapping("/modificaEspecie/{idEspecie}")
     public String ModificarEspecie(@PathVariable("idEspecie") Long idEspecie,Model model){
         Especies especies= especiService.getEspecie(idEspecie);
         model.addAttribute("Especie", especies);
         return"ModificarEspecie";
         
     
     }
    @PostMapping("/guardarEspecie")
    public String ProductoActulizar(Especies especie){
        especiService.SaveEspecie(especie);
        return"redirect:/Especies";
    }
     
     
    
    
}
