/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Brandon
 */

@Data
@Entity
@Table(name ="producto")

//Sereialización va a almacenar datos 
public class Producto implements Serializable{
    
    private static final long serialVersionUID = 1L; //para poder hacer el ciclo de la sumatoria de la categoría (AUTO_INCREMENT)
    
    @Id /*Id es la llave de la tabla categoría*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private long idProducto;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public Producto() {
    }

    public Producto(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }
    
    
}
