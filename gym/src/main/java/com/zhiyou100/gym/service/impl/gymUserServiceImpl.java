package com.zhiyou100.gym.service.impl;

import com.zhiyou100.gym.mapper.gymUserMapper;
import com.zhiyou100.gym.pojo.gymUser;
import com.zhiyou100.gym.service.gymUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "gymUserService")
public class gymUserServiceImpl implements gymUserService {

    @Autowired
    private gymUserMapper gymUserMapper;

    @Override
    public List<gymUser> queryAll() {
        return gymUserMapper.selectList(null);
    }
}
