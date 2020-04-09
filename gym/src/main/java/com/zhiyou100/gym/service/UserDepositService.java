package com.zhiyou100.gym.service;


import com.zhiyou100.gym.entity.ResponseData;
import com.zhiyou100.gym.pojo.UserDeposit;

public interface UserDepositService {
    //添加会员充值记录
    void inserUserDeposit(UserDeposit userDeposit);
    //查询所有会员充值记录
    ResponseData selectAllUserDeposit();
}
