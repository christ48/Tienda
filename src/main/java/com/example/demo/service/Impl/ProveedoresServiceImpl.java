/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service.Impl;

/**
 *
 * @author lossa
 */
import com.example.demo.domain.Proveedores;
import com.example.demo.DAo.ProveedorDao;
import com.example.demo.service.ProveedorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProveedoresServiceImpl implements ProveedorService {

    @Autowired
    private ProveedorDao proveedorDao;

    @Transactional(readOnly = true)
    @Override
    public List<Proveedores>getProveedores(){
        return proveedorDao.findAll();
    }
    @Override
    @Transactional(readOnly = true)
    public Proveedores getProvedor(Long id){
       return proveedorDao.findById(id).orElse(null);
     }
    
    
    @Override
    @Transactional
    public void SaveProveedor(Proveedores proveedores){
        proveedorDao.save(proveedores);
    }
    @Override
    @Transactional
    public void DeleteProveedor(Long id){
        proveedorDao.deleteById(id);
    }
    @Override
    @Transactional
    public void UpdateProveedor(Proveedores proveedores){
        proveedorDao.save(proveedores);
    }

}
