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
@Table(name = "cliente")
public class Cliente {
    
    @Id
    @Column(name = "cli_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cli_id;
    
    @Column(name = "cli_dni")
    private String cli_dni;
    
    @Column(name = "cli_nombres")
    private String cli_nombres;
    
    @Column(name = "cli_direccion")
    private String cli_direccion;
    
    @Column(name = "cli_tlf1")
    private String cli_tlf1;
    
    @Column(name = "cli_tlf2")
    private String cli_tlf2;
    
    @Column(name = "cli_email")
    private String cli_email;
    
    @Column(name = "cli_instagram")
    private String cli_instagram;

    public int getCli_id() {
        return cli_id;
    }

    public void setCli_id(int cli_id) {
        this.cli_id = cli_id;
    }

    public String getCli_dni() {
        return cli_dni;
    }

    public void setCli_dni(String cli_dni) {
        this.cli_dni = cli_dni;
    }

    public String getCli_nombres() {
        return cli_nombres;
    }

    public void setCli_nombres(String cli_nombres) {
        this.cli_nombres = cli_nombres;
    }

    public String getCli_direccion() {
        return cli_direccion;
    }

    public void setCli_direccion(String cli_direccion) {
        this.cli_direccion = cli_direccion;
    }

    public String getCli_tlf1() {
        return cli_tlf1;
    }

    public void setCli_tlf1(String cli_tlf1) {
        this.cli_tlf1 = cli_tlf1;
    }

    public String getCli_tlf2() {
        return cli_tlf2;
    }

    public void setCli_tlf2(String cli_tlf2) {
        this.cli_tlf2 = cli_tlf2;
    }

    public String getCli_email() {
        return cli_email;
    }

    public void setCli_email(String cli_email) {
        this.cli_email = cli_email;
    }

    public String getCli_instagram() {
        return cli_instagram;
    }

    public void setCli_instagram(String cli_instagram) {
        this.cli_instagram = cli_instagram;
    }
    
    
}
