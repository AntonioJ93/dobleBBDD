/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deportessa.proyectodeportes.daojpa;

import com.deportessa.proyectodeportes.modelo.Cliente;
import java.util.List;
import java.util.Optional;
import javax.ejb.Local;

/**
 *
 * @author Antonio
 */
@Local
public interface ClienteLocal {

    void create(Cliente cliente);

    void edit(Cliente cliente);

    void remove(Cliente cliente);

    Cliente find(Object id);

    List<Cliente> findAll();

    List<Cliente> findRange(int[] range);

    int count();

    Optional<Cliente> findByEmail(String email);
    
}
