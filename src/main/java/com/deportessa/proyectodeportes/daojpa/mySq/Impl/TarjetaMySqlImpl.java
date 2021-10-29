/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deportessa.proyectodeportes.daojpa.mySq.Impl;

import com.deportessa.proyectodeportes.modelo.Tarjeta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.deportessa.proyectodeportes.daojpa.TarjetaLocal;
import com.deportessa.proyectodeportes.daojpa.mysql.TarjetaMySqlLocal;

/**
 *
 * @author Antonio
 */
@Stateless
public class TarjetaMySqlImpl extends DaoGenericoAbstracto<Tarjeta, Integer> implements TarjetaMySqlLocal {

    @PersistenceContext(unitName = "pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TarjetaMySqlImpl() {
        super(Tarjeta.class);
    }
    
}
