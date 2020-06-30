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
public class ClienteServiceImp implements ClienteService {

    private ClienteRepository repositoriocli;

    @Override
    public List<Cliente> listar() {
        return repositoriocli.findAll();
    }

    @Override
    public Cliente listarid(int id) {
        return repositoriocli.findByid(id);
    }

    @Override
    public Cliente add(Cliente cli) {
        return repositoriocli.save(cli);
    }

    @Override
    public Cliente edit(Cliente cli) {
        return repositoriocli.save(cli);
    }

    @Override
    public void delete(int id) {
        repositoriocli.deleteByid(id);
    }

}
