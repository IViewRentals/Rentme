package com.example.rentsummary.dao;

import com.example.rentsummary.model.CityEntity;
import com.example.rentsummary.model.StateEntity;
import com.example.rentsummary.model.UserEntity;

import java.util.List;

public interface UserDAO {


    // 用户登录
    UserEntity login(UserEntity userEntity);

    // 用户注册
    int register(UserEntity userEntity);

    List<StateEntity> getState();

    List<CityEntity> getCityById(int id);
}
