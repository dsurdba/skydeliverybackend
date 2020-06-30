/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobaca.skydelivery.controller;

import com.jobaca.skydelivery.entity.Cliente;
import com.jobaca.skydelivery.repositories.ClienteService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 *
 * @author JhonnyBarrios
 */

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
//@RequestMapping("/personas")
@Transactional
public class Controlador {
    
    @Autowired
    ClienteService servicecli;
    
    
    

    @GetMapping("/listarclientes")
    public List<Cliente> listar() {

        return servicecli.listar();

    }

    @PostMapping("/addcliente")
    public Cliente agregar(@RequestBody Cliente p) {
        return servicecli.add(p);
    }

    @GetMapping(path = {"/clientexid/{id}"})
    public Cliente listarId(@PathVariable("id") int id) {
        return servicecli.listarid(id);
    }

    @PutMapping(path = {"/updatecliente/{id}"})
    public Cliente editar(@RequestBody Cliente cli, @PathVariable("cli_id") int id) {
        cli.setCli_id(id);
        return servicecli.edit(cli);
    }

    @DeleteMapping(path = {"/deletecliente/{id}"})
    public void delete(@PathVariable("id") int id) {
        //return service.delete(id);
    servicecli.delete(id);
    }
    
}
