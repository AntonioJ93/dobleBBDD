/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package com.deportessa.proyectodeportes.daojpa.factory;

import javax.ejb.Local;

/**
 *
 * @author Antonio
 * 
 */
@Local
public interface DaoFactoryLocal {
    
    DaoMySqlLocal getDaoMySql();
    
    DaoMongoLocal getDaoMongo();
}
