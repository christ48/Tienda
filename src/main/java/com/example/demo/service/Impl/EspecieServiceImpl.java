/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service.Impl;
import com.example.demo.domain.Especies;
import com.example.demo.DAo.EspecieDAO;
import com.example.demo.service.EspeciesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author lossa
 */
@Service
public class EspecieServiceImpl implements EspeciesService{
    
    @Autowired
    private EspecieDAO especieDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Especies> getEspecies() {
        return especieDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Especies getEspecie(Long idEspecie) {
        return especieDAO.findById(idEspecie).orElse(null);
    }

    @Override
    @Transactional
    public void SaveEspecie(Especies especie) {
        especieDAO.save(especie);
    }

    @Override
    @Transactional
    public void deleteEspecie(Long idEspecie) {
        especieDAO.deleteById(idEspecie);
    }

    @Override
    @Transactional
    public void UpdateEspecie(Especies especie) {
        especieDAO.save(especie);
    }
    
    
    
}
