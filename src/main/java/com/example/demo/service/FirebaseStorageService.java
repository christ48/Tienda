/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author lossa
 */
@Service
public interface FirebaseStorageService {
    public String cargaImagen(MultipartFile archivoLocalCliente,String carpeta, Long id);
    final String BucketName="bettastore-8ca23.appspot.com";
    final String rutaSuperiorStorage= "BettaStore";
    final String rutaJsonFile="firebase";
    final String archivoJsonFile="bettastore-8ca23-firebase-adminsdk-605zu-db3e5d99b7";

}
