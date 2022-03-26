package com.example.rentsummary.server;

import com.example.rentsummary.model.AreaEntity;
import com.example.rentsummary.model.CityEntity;
import com.example.rentsummary.model.StateEntity;
import com.example.rentsummary.model.UserEntity;
import org.apache.catalina.User;

import java.util.List;

public interface UserService {

    void register(UserEntity userEntity);

    UserEntity login(UserEntity userEntity);

    List<StateEntity> getState();

    List<CityEntity> getCityById(int id);

    void addUserHistory(UserEntity userEntity);

    UserEntity getUserById(int id);

    List<AreaEntity> getAreaById(int id);
}
