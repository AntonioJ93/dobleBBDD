/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deportessa.proyectodeportes.daojpa.mySq.Impl;

import com.deportessa.proyectodeportes.modelo.Transferencia;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.deportessa.proyectodeportes.daojpa.mysql.TransferenciaMySqlLocal;

/**
 *
 * @author Antonio
 */
@Stateless
public class TransferenciaMySqlImpl extends DaoGenericoAbstracto<Transferencia, Integer> implements TransferenciaMySqlLocal {

    @PersistenceContext(unitName = "pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TransferenciaMySqlImpl() {
        super(Transferencia.class);
    }
    
}
