package me.sungbin.chapter3.ch03_13.domain.userinfo.dao;

import me.sungbin.chapter3.ch03_13.domain.userinfo.UserInfo;

public interface UserInfoDao {

    void insertUserInfo(UserInfo userInfo);

    void updateUserInfo(UserInfo userInfo);

    void deleteUserInfo(UserInfo userInfo);
}
