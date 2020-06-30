/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobaca.skydelivery.repositories;

import com.jobaca.skydelivery.entity.Cliente;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author JB
 */
public interface ClienteRepository extends Repository<Cliente, Integer> {

    public List<Cliente> findAll();

    public Cliente findByid(int id);

    public Cliente save(Cliente cli);

    public void deleteByid(int id);

}
