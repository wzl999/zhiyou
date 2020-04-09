package com.zhiyou100.gym.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiyou100.gym.pojo.AdminLogin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdminLoginMapper extends BaseMapper<AdminLogin> {
    @Select(value = "select * from admin_login where account =#{account}")
    AdminLogin selectByAccount(String account);
}
