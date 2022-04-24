package com.example.rentsummary.dao;

import com.example.rentsummary.model.AreaEntity;
import com.example.rentsummary.model.CityEntity;
import com.example.rentsummary.model.StateEntity;
import com.example.rentsummary.model.UserEntity;

import java.util.List;

public interface UserDAO {


    /**
     * user login
     * @param userEntity
     * @return
     */
    UserEntity login(UserEntity userEntity);

    /**
     * user register
     * @param userEntity
     * @return
     */
    int register(UserEntity userEntity);

    /**
     * 获取州
     * @return
     */
    List<StateEntity> getState();

    /**
     * 根据ID获取城市
     * @param id
     * @return
     */
    List<CityEntity> getCityById(int id);

    /**
     * 添加用户搜索记录
     * @param userEntity
     */
    void addUserHistory(UserEntity userEntity);

    /**
     * 根据ID获取用户
     * @param id
     * @return
     */
    UserEntity getUserById(int id);

    /**
     * 根据ID获取区域
     * @param id
     * @return
     */
    List<AreaEntity> getAreaById(int id);

    /**
     * 根据账号获取用户（判断用户名是否重复）
     * @param account
     * @return
     */
    List<UserEntity> getUserByAccount(String account);

    /**
     * 根据邮箱验证码查询用户
     * @param userEntity
     * @return
     */
    UserEntity getUserByEmailCode(UserEntity userEntity);

    /**
     * 查询邮箱是否存在
     * @param email
     * @return
     */
    List<UserEntity> getUserByEmail(String email);

    /**
     * 清除验证码记录
     * @param userEntity
     */
    void clearCode(UserEntity userEntity);

    /**
     * 根据账户名清除邮箱验证码
     * @param userEntity
     */
    void clearUserEmailCode(UserEntity userEntity);

    /**
     * 根据邮箱查找用户并存入验证码
     * @param userEntity
     */
    void updateEmailCodeByEmail(UserEntity userEntity);

    /**
     * 修改密码
     * @param userEntity
     */
    void updatePasswordByAccount(UserEntity userEntity);
}
