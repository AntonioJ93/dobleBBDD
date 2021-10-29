/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.deportessa.proyectodeportes.daojpa.factory;

import com.deportessa.proyectodeportes.daojpa.mysql.ActividadMySqlLocal;
import com.deportessa.proyectodeportes.daojpa.mysql.ClienteMySqlLocal;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Antonio
 */
@Stateless
public class DaoMySql implements DaoMySqlLocal {

    @Inject
    private ClienteMySqlLocal clienteMySqlLocal;
    
    @Inject
    private ActividadMySqlLocal actividadMySqlLocal;

    public ClienteMySqlLocal getClienteMySqlLocal() {
        return clienteMySqlLocal;
    }

    public ActividadMySqlLocal getActividadMySqlLocal() {
        return actividadMySqlLocal;
    }
    
    
}
