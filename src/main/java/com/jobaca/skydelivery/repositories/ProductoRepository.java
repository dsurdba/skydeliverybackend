/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobaca.skydelivery.repositories;

import com.jobaca.skydelivery.entity.Producto;
import java.util.List;

/**
 * @author JhonnyBarrios
**/

public interface ProductoRepository {

    public List<Producto> findAll();

    public Producto findByid(int id);

    public Producto save(Producto prod);

    public void deleteByid(int id);

}
