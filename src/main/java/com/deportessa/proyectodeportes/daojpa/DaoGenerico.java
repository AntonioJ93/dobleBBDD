/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.deportessa.proyectodeportes.daojpa;

import java.util.List;

/**
 *
 * @author Antonio
 * @param <T>
 * @param <ID>
 */
public interface DaoGenerico<T, ID> {

    int count();

    void create(T entity);

    void edit(T entity);

    T find(Object id);

    List<T> findAll();

    List<T> findRange(int[] range);

    void remove(T entity);
    
    T findById(ID id);
    
    void deleteById(ID id);
}
