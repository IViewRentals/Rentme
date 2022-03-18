package com.example.rentsummary.dao;

import com.example.rentsummary.model.CityEntity;
import com.example.rentsummary.model.StateEntity;
import com.example.rentsummary.model.UserEntity;

import java.util.List;

public interface UserDAO {


    // user login
    UserEntity login(UserEntity userEntity);

    // user reigister
    int register(UserEntity userEntity);

    List<StateEntity> getState();

    List<CityEntity> getCityById(int id);
}
