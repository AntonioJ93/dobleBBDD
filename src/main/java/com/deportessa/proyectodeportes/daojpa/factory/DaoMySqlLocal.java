/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package com.deportessa.proyectodeportes.daojpa.factory;

import com.deportessa.proyectodeportes.daojpa.mysql.ActividadMySqlLocal;
import com.deportessa.proyectodeportes.daojpa.mysql.ClienteMySqlLocal;
import com.deportessa.proyectodeportes.daojpa.mysql.EntrenadorMySqlLocal;
import com.deportessa.proyectodeportes.daojpa.mysql.InscripcionMySqlLocal;
import com.deportessa.proyectodeportes.daojpa.mysql.MetodoPagoMySqlLocal;
import com.deportessa.proyectodeportes.daojpa.mysql.PayPalMySqlLocal;
import com.deportessa.proyectodeportes.daojpa.mysql.TarjetaMySqlLocal;
import com.deportessa.proyectodeportes.daojpa.mysql.TransferenciaMySqlLocal;
import javax.ejb.Local;

/**
 *
 * @author Antonio
 */
@Local
public interface DaoMySqlLocal {
    ClienteMySqlLocal getClienteMySqlLocal();
    
    ActividadMySqlLocal getActividadMySqlLocal();
    
    EntrenadorMySqlLocal getEntrenadorMySqlLocal();
            
    InscripcionMySqlLocal getInscripcionMySqlLocal();
            
    MetodoPagoMySqlLocal getMetodoPagoMySqlLocal();
    
    PayPalMySqlLocal getPayPalMySqlLocal();
    
    TarjetaMySqlLocal getTarjetaMySqlLocal();
    
    TransferenciaMySqlLocal getTransferenciaMySqlLocal();
}
