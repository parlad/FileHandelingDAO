/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neupane.DAO;

import java.util.List;

/**
 *
 * @author parlad
 * @param <T>
 */
public interface GenericDAO<T> {

    void insert(T t);

    List<T> getAll();

    T getById(int id);

}
