/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deportessa.proyectodeportes.daojpa.mySq.Impl;

import com.deportessa.proyectodeportes.modelo.Entrenador;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.deportessa.proyectodeportes.daojpa.EntrenadorLocal;
import com.deportessa.proyectodeportes.daojpa.mysql.EntrenadorMySqlLocal;

/**
 *
 * @author Antonio
 */
@Stateless
public class EntrenadorMySqlImpl extends DaoGenericoAbstracto<Entrenador, Integer> implements EntrenadorMySqlLocal {

    @PersistenceContext(unitName = "pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EntrenadorMySqlImpl() {
        super(Entrenador.class);
    }
    
}
