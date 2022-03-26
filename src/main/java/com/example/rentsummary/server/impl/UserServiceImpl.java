package com.example.rentsummary.server.impl;

import com.example.rentsummary.dao.UserDAO;
import com.example.rentsummary.model.CityEntity;
import com.example.rentsummary.model.StateEntity;
import com.example.rentsummary.model.UserEntity;
import com.example.rentsummary.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO dao;

    @Override
    public void register(UserEntity userEntity) {
        dao.register(userEntity);
    }

    @Override
    public UserEntity login(UserEntity userEntity) {
        return dao.login(userEntity);
    }

    @Override
    public List<StateEntity> getState() {
        return dao.getState();
    }

    @Override
    public List<CityEntity> getCityById(int id) {
        return dao.getCityById(id);
    }

    @Override
    public void addUserHistory(UserEntity userEntity) {
        dao.addUserHistory(userEntity);
    }

    @Override
    public UserEntity getUserById(int id) {
        return dao.getUserById(id);
    }

}
