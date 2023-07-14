package com.example.demo.service.Impl;

import com.example.demo.DAo.ProductoDao;
import com.example.demo.domain.Producto;
import com.example.demo.service.Productoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductosServiceImpl implements Productoservice {

    @Autowired
    private ProductoDao productoDao;

  
    @Transactional(readOnly = true)
    @Override
    public List<Producto> getProductos() {
        return productoDao.findAll();
    }

  
    @Override
    @Transactional(readOnly = true)
    public Producto getProducto(Long idProducto) {
        return productoDao.findById(idProducto).orElse(null);
    }

    @Override
    @Transactional
    public void saveProducto(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    @Transactional
    public void deleteProducto(Long idProducto) {
        productoDao.deleteById(idProducto);
    }

    @Override
    @Transactional
    public void updateProducto(Producto producto) {
        productoDao.save(producto);
    }
}

