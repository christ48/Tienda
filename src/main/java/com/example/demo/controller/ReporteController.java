/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.example.demo.service.ReportesService;
import static io.grpc.Context.key;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author lossa
 */
@Controller
@Slf4j
public class ReporteController {
    @Autowired
    
    ReportesService reportesService;

    @GetMapping("Reportes")
    public String principal(Model model) {
       String id_Proveedor="";
        model.addAttribute("id_Proveedor", id_Proveedor);
        return "Reportes";
    }
@GetMapping("/ReporteEspecies")
public ResponseEntity<Resource> ReporteEspecies(@RequestParam String tipo) throws IOException {
    
	var reporte="ReporteEspecies";
	return reportesService.generaReporte(reporte, new HashMap<>(), tipo);
}
@GetMapping("/ReporteProveedores")
public ResponseEntity<Resource>ReporteProveedores(@RequestParam String tipo) throws IOException{
    var reporte="ReporteProveedores";
    return reportesService.generaReporte(reporte,new HashMap<>(), tipo);
}
@GetMapping("/EspecieProveedor")
public ResponseEntity<Resource> reporteEspecieProveedores(
        @RequestParam String id_Proveedor,
        @RequestParam String tipo) throws IOException {
    Map<String, Object> parametros = new HashMap<>();
    
    parametros.put("ValorId", id_Proveedor);
    var reporte = "ReporteEspeciesProveedor";
    return reportesService.generaReporte(reporte, parametros, tipo);
}


}
