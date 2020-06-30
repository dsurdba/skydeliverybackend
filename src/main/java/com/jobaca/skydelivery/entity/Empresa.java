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
 @author JhonnyBarrios
 */

@Entity
@Table(name = "empresa")
public class Empresa {
    
    @Id
    @Column(name ="emp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_id;
    
    @Column(name ="emp_dni")
    private String emp_dni;
    
    @Column(name="emp_nombre")
    private String emp_nombre;
    
    @Column(name="emp_tipo")
    private String emp_tipo;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_dni() {
        return emp_dni;
    }

    public void setEmp_dni(String emp_dni) {
        this.emp_dni = emp_dni;
    }

    public String getEmp_nombre() {
        return emp_nombre;
    }

    public void setEmp_nombre(String emp_nombre) {
        this.emp_nombre = emp_nombre;
    }

    public String getEmp_tipo() {
        return emp_tipo;
    }

    public void setEmp_tipo(String emp_tipo) {
        this.emp_tipo = emp_tipo;
    }
    
    
    
}
