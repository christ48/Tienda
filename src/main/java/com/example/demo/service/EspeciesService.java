/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;
import com.example.demo.domain.Especies;
import java.util.List;
/**
 *
 * @author lossa
 */
public interface EspeciesService {
    List<Especies> getEspecies();
    
    Especies getEspecie(Long idEspecie);
    
    void SaveEspecie(Especies especie);
    
    void deleteEspecie(Long idEspecie);
    
    void UpdateEspecie(Especies especie);
    
}
