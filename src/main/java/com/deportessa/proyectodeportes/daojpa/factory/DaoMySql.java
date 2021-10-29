/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
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
    
    @Inject
    private EntrenadorMySqlLocal entrenadorMySqlLocal;
    
    @Inject
    private InscripcionMySqlLocal inscripcionMySqlLocal;
    
    @Inject
    private MetodoPagoMySqlLocal metodoPagoMySqlLocal;
    
    @Inject
    private PayPalMySqlLocal payPalMySqlLocal;
    
    @Inject
    private TarjetaMySqlLocal tarjetaMySqlLocal;
    
    @Inject
    private TransferenciaMySqlLocal transferenciaMySqlLocal;

    @Override
    public ClienteMySqlLocal getClienteMySqlLocal() {
        return clienteMySqlLocal;
    }

    @Override
    public ActividadMySqlLocal getActividadMySqlLocal() {
        return actividadMySqlLocal;
    }

    @Override
    public EntrenadorMySqlLocal getEntrenadorMySqlLocal() {
        return entrenadorMySqlLocal;
    }

    @Override
    public InscripcionMySqlLocal getInscripcionMySqlLocal() {
        return inscripcionMySqlLocal;
    }

    @Override
    public MetodoPagoMySqlLocal getMetodoPagoMySqlLocal() {
        return metodoPagoMySqlLocal;
    }

    @Override
    public PayPalMySqlLocal getPayPalMySqlLocal() {
        return payPalMySqlLocal;
    }

    @Override
    public TarjetaMySqlLocal getTarjetaMySqlLocal() {
        return tarjetaMySqlLocal;
    }

    @Override
    public TransferenciaMySqlLocal getTransferenciaMySqlLocal() {
        return transferenciaMySqlLocal;
    }    
        
    
    
}
