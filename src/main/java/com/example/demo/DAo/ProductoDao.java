/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.DAo;

/**
 *
 * @author lossa
 */
import com.example.demo.domain.Producto;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
public interface ProductoDao extends JpaRepository <Producto,Long> {
  public List<Producto> findByPrecioBetweenOrderByDescripcion(BigDecimal precioInf, BigDecimal precioSup);

    @Query(value = "SELECT p FROM Producto p WHERE p.precio BETWEEN :precioInf AND :precioSup ORDER BY p.descripcion ASC")
    public List<Producto> metodoJPQL(@Param("precioInf") BigDecimal precioInf, @Param("precioSup") BigDecimal precioSup);

    @Query(nativeQuery = true, value = "SELECT * FROM producto p WHERE p.precio BETWEEN :precioInf AND :precioSup ORDER BY p.descripcion ASC")
    public List<Producto> metodoNativo(@Param("precioInf") BigDecimal precioInf, @Param("precioSup") BigDecimal precioSup);

}
