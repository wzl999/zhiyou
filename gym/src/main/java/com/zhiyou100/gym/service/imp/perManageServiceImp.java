package com.zhiyou100.gym.service.imp;

import com.zhiyou100.gym.mapper.perManageMapper;
import com.zhiyou100.gym.pojo.perManage;
import com.zhiyou100.gym.service.perManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class perManageServiceImp implements perManageService {
    @Autowired
    private perManageMapper perManageMapper;
    @Override
    public List<perManage> selectAll() {
        return perManageMapper.selectList(null);
    }
}
