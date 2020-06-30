/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobaca.skydelivery.repositories;

import com.jobaca.skydelivery.entity.Cliente;
import java.util.List;

/**
 *
 * @author JB
 */
public interface ClienteService {

    public List<Cliente> listar();

    public Cliente listarid(int id);

    public Cliente add(Cliente cli);

    public Cliente edit(Cliente cli);

    public void delete(int id);

}
