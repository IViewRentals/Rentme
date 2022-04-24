package com.example.rentsummary.server.impl;

import com.example.rentsummary.dao.UserDAO;
import com.example.rentsummary.model.AreaEntity;
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

    @Override
    public List<AreaEntity> getAreaById(int id) {
        return dao.getAreaById(id);
    }

    @Override
    public List<UserEntity> getUserByAccount(String account) {
        return dao.getUserByAccount(account);
    }

    @Override
    public UserEntity getUserByEmailCode(UserEntity userEntity) {
        return dao.getUserByEmailCode(userEntity);
    }


    @Override
    public List<UserEntity> getUserByEmail(String email) {
        return dao.getUserByEmail(email);
    }

    @Override
    public void clearUserEmailCode(UserEntity userEntity) {
        dao.clearUserEmailCode(userEntity);
    }

    @Override
    public void updateEmailCodeByEmail(UserEntity userEntity) {
        dao.updateEmailCodeByEmail(userEntity);
    }

    @Override
    public void updatePasswordByAccount(UserEntity userEntity) {
        dao.updatePasswordByAccount(userEntity);
    }

    @Override
    public void clearCode(UserEntity userEntity) {
        dao.clearCode(userEntity);
    }
}
