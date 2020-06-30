/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobaca.skydelivery.entity;

import javax.persistence.*;
import javax.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author JhonnyBarrios
 */

@Entity
@Table(name ="producto")
public class Producto {
        
    @Id
    @Column(name="prod_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int prod_id;
    
    
    @Column(name="prod_idempresa")
    private int prod_idempresa;
    
    @Column(name="prod_descripcion")
    private String prod_descripcion;
    
    @Column(name="prod_precio")
    private Double prod_precio;
    
    @Column(name="prod_preciodash")
    private Double prod_preciodash;

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public int getProd_idempresa() {
        return prod_idempresa;
    }

    public void setProd_idempresa(int prod_idempresa) {
        this.prod_idempresa = prod_idempresa;
    }

    public String getProd_descripcion() {
        return prod_descripcion;
    }

    public void setProd_descripcion(String prod_descripcion) {
        this.prod_descripcion = prod_descripcion;
    }

    public Double getProd_precio() {
        return prod_precio;
    }

    public void setProd_precio(Double prod_precio) {
        this.prod_precio = prod_precio;
    }

    public Double getProd_preciodash() {
        return prod_preciodash;
    }

    public void setProd_preciodash(Double prod_preciodash) {
        this.prod_preciodash = prod_preciodash;
    }
    
    
    
    
    
}
