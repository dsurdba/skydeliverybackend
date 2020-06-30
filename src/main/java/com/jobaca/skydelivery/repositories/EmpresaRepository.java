/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobaca.skydelivery.repositories;

import com.jobaca.skydelivery.entity.Empresa;
import java.util.List;

/**
 *
 * @author JB
 */
public interface EmpresaRepository {

    public List<Empresa> findAll();

    public Empresa findByid(int id);

    public Empresa save(Empresa emp);

    public void deleteByid(int id);

}
