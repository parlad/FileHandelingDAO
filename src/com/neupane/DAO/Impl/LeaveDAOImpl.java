/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neupane.DAO.Impl;

import com.neupane.DAO.LeaveDAO;
import com.neupane.entity.Leave;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author parlad
 */
public class LeaveDAOImpl implements LeaveDAO {

    private List<Leave> leaveList;

    public LeaveDAOImpl() {
        leaveList = new ArrayList<>();
    }

    public LeaveDAOImpl(List<Leave> leaveList) {
        leaveList = new ArrayList<>();
    }

    @Override
    public void insert(Leave e) {
        leaveList.add(e);
    }

    @Override
    public List<Leave> getAll() {
        return leaveList;
    }

    @Override
    public Leave getById(int id) {
        return null;
    }

}
