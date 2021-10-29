/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deportessa.proyectodeportes.daojpa.mySq.Impl;

import com.deportessa.proyectodeportes.modelo.Inscripcion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.deportessa.proyectodeportes.daojpa.InscripcionLocal;
import com.deportessa.proyectodeportes.daojpa.mysql.InscripcionMySqlLocal;

/**
 *
 * @author Antonio
 */
@Stateless
public class InscripcionMySqlImpl extends DaoGenericoAbstracto<Inscripcion, Integer> implements InscripcionMySqlLocal {

    @PersistenceContext(unitName = "pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InscripcionMySqlImpl() {
        super(Inscripcion.class);
    }
    
}
