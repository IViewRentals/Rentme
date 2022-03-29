package com.example.rentsummary.mapper;

import com.example.rentsummary.dao.UserDAO;
import com.example.rentsummary.model.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UsersMapperTests {
    @Autowired
    private UserDAO dao;

    @Test
    public void register(){
        UserEntity entity=new UserEntity();
        entity.setAccount("hs");
        entity.setPassword("hs");
        int rows=dao.register(entity);
        System.out.println(rows);
    }

    @Test
    public void getUserById(){
        UserEntity entity=dao.getUserById(1);
        System.out.println(entity);
    }

    @Test
    public void login(){
        UserEntity entity=new UserEntity();
        UserEntity userEntity=dao.login(entity);
        System.out.println(userEntity);
    }
}
