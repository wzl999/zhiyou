package com.zhiyou100.gym.service;


import com.zhiyou100.gym.pojo.UserInto;

public interface UserIntoService {
    //会员出场
    public void updateUserInto(UserInto userInto);
    //会员进场
    void insertUserInto(UserInto userInto);
}
