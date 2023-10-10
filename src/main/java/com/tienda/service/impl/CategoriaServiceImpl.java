/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service.impl;

import com.tienda.dao.CategoriaDao;
import com.tienda.domain.Categoria;
import com.tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Brandon
 */

@Service
public class CategoriaServiceImpl implements CategoriaService{
    
    //La anotación autowired crea un único objeto mientras se ejecuta la applicación
    
    @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    public List<Categoria> getCategorias(boolean activos){
        
        var lista = categoriaDao.findAll(); //Encontrar todos los datos de la lista
        
        if(activos){
            lista.removeIf(e-> !e.isActivo()); //expresión lambda
        }
        return lista;
    }
    
}
