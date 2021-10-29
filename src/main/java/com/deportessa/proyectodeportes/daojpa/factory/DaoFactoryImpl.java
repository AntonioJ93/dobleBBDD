/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.deportessa.proyectodeportes.daojpa.factory;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Antonio
 */
@Stateless
public class DaoFactoryImpl implements DaoFactoryLocal {

//    @Inject
//    private ActividadLocal actividadLocal;
//    
//    @Inject
//    private ClienteLocal clienteLocal;
//    
//    @Inject
//    private EntrenadorLocal entrenadorLocal;
//    
//    @Inject
//    private InscripcionLocal inscripcionLocal;
//    
//    @Inject
//    private MetodoPagoLocal metodoPagoLocal;
//    
//    @Inject
//    private TarjetaLocal tarjetaLocal;
//    
//    @Inject 
//    private PaypalLocal paypalLocal;
//    
//    @Inject 
//    private TransferenciaLocal transferenciaLocal;
    
    @Inject
    private DaoMySqlLocal daoMySql;

    @Inject
    private DaoMongoLocal daoMongo;

    @Override
    public DaoMySqlLocal getDaoMySql() {
        return daoMySql;
    }

    @Override
    public DaoMongoLocal getDaoMongo() {
        return daoMongo;
    }


}
