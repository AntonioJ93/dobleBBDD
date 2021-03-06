/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deportessa.proyectodeportes.daojpa.mySq.Impl;


import com.deportessa.proyectodeportes.modelo.Actividad;
import com.deportessa.proyectodeportes.modelo.Cliente;
import com.deportessa.proyectodeportes.modelo.Inscripcion;
import com.deportessa.proyectodeportes.modelo.MetodoPago;
import com.deportessa.proyectodeportes.modelo.Tarjeta;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.deportessa.proyectodeportes.daojpa.ActividadLocal;
import com.deportessa.proyectodeportes.daojpa.ClienteLocal;
import com.deportessa.proyectodeportes.daojpa.InscripcionLocal;
import com.deportessa.proyectodeportes.daojpa.MetodoPagoLocal;
import com.deportessa.proyectodeportes.daojpa.factory.DaoFactoryLocal;
import com.deportessa.proyectodeportes.daojpa.factory.DaoMySqlLocal;
import com.deportessa.proyectodeportes.modelo.Entrenador;

/**
 *
 * @author pryet
 */
@WebServlet(name = "PruebaDAO", urlPatterns = {"/prueba"})
public class PruebaDAO extends HttpServlet {

    
    @Inject
    private DaoFactoryLocal daoFactoryLocal;
    
    
    
//    @Inject
//    ActividadLocal actiDAO;
//    @Inject
//    ClienteLocal clienteDAO;
//    @Inject
//    MetodoPagoLocal metodoDAO;
//    @Inject
//    InscripcionLocal inscripcionDAO;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        DaoMySqlLocal dao=daoFactoryLocal.getDaoMySql();
        
        /////////////////// A??ADIR ACTIVIDAD ///////////////////////
        Actividad jockey = new Actividad("jockey playa", "playa", "comer arena", new BigDecimal(20), "L-Mi-V");
        Actividad futbol = new Actividad("futbol", "campos de futbol", "pegar patas", new BigDecimal(10), "L-M-Mi");
        dao.getActividadMySqlLocal().create(jockey);
        dao.getActividadMySqlLocal().create(futbol);
//        actiDAO.create(jockey);
//        actiDAO.create(futbol);
//
//        /////////////// A??ADIR CLIENTE /////////////////

        Cliente cliente1 = new Cliente("prueba@email.com", "1234", "paco", "garcia", "666555444");
        Cliente cliente2 = new Cliente("prueba2@email.com", "1234", "paco2", "perez2", "222222222");
        dao.getClienteMySqlLocal().create(cliente1);
        dao.getClienteMySqlLocal().create(cliente2);
        //clienteDAO.create(cliente1);
//        clienteDAO.create(cliente2);
//
//        /////////////// A??ADIR TARJETA /////////////////
        Tarjeta t2 = new Tarjeta(123, 12, 2022, 555);
        Tarjeta t3 = new Tarjeta(222, 12, 2022, 555);
        Tarjeta t4 = new Tarjeta(333, 12, 2022, 555);

        cliente1.addMPago(t2);
        cliente1.addMPago(t3);
        cliente2.addMPago(t4);
        
        dao.getClienteMySqlLocal().edit(cliente1);
        dao.getClienteMySqlLocal().edit(cliente2);
//        try {
//            clienteDAO.edit(cliente1);
//            clienteDAO.edit(cliente2);
//        } catch (Exception ex) {
//            Logger.getLogger(PruebaDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//

           List<MetodoPago> lista2 =dao.getClienteMySqlLocal().find(1).getMetodosPagoCliente();

//        List<MetodoPago> lista2 = clienteDAO.find(1).getMetodosPagoCliente();
        for (MetodoPago p : lista2) {
            System.out.println(p);
        }
//
//        /////////// EDITAR METODO DE PAGO ////////////////////
        Tarjeta nueva = new Tarjeta(0000, 5, 3000, 258);
        MetodoPago mp =dao.getMetodoPagoMySqlLocal().find(1);
//        MetodoPago mp = metodoDAO.find(1);
        mp.editarMetodoPago(nueva);
        dao.getMetodoPagoMySqlLocal().edit(mp);
        
//        try {
//            metodoDAO.edit(mp);
//            cliente2 = clienteDAO.find(2);
//            cliente1 = clienteDAO.find(1);
//            clienteDAO.edit(cliente2);
//            clienteDAO.edit(cliente1);
//            clienteDAO.edit(cliente2);
//            clienteDAO.edit(cliente1);
//
//        } catch (Exception ex) {
//            Logger.getLogger(PruebaDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
          List<MetodoPago> lista3 =dao.getClienteMySqlLocal().find(cliente1.getIdCliente()).getMetodosPagoCliente();
//        List<MetodoPago> lista3 = cliente1.getMetodosPagoCliente();
        for (MetodoPago p : lista3) {
            System.out.println(p);
        }
////////////// INSCRIPCIONES  /////////////////////////
        Inscripcion insc = new Inscripcion(futbol, dao.getClienteMySqlLocal().find(cliente1.getIdCliente()).getMetodosPagoCliente().get(0));
//        mp=dao.getClienteMySqlLocal().findByEmail("prueba@email.com").get().getMetodosPagoCliente().get(0);
 //       mp=cliente1.getMetodosPagoCliente().get(0);
//        mp.addInscripcion(insc);
//        dao.getMetodoPagoMySqlLocal().edit(mp);
    dao.getInscripcionMySqlLocal().create(insc);
//        try {
//            metodoDAO.edit(mp);
//        } catch (Exception ex) {
//            Logger.getLogger(PruebaDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
    Actividad acti=dao.getActividadMySqlLocal().find(1);
    acti.setIdEntrenadorActividad(new Entrenador("Juan", "Mart??nez"));
    dao.getActividadMySqlLocal().edit(acti);
        System.out.println(mp.getInscripciones().size());
        
        
        System.out.println(dao.getClienteMySqlLocal().findByEmail("prueba@email.com"));
        
//        System.out.println(clienteDAO.findByEmail("prueba@email.com")) ;
//        System.out.println(clienteDAO.findByEmail("xxx@email.com")) ;
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
