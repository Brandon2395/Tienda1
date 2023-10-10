/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

/**
 *
 * @author Brandon
 */
public interface CategoriaService {
    
    //Se declara un método para obtener un ArrayList de objetos Categoria
    //Los objetos vienen de la tabla categoria, todos los registros.
    
    public List<Categoria> getCategorias(boolean activos);
    
    //Abajo se colocara los metodos para realizar el CRUD de las categorias, semana 6
}
