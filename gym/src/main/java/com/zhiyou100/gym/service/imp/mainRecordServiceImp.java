package com.zhiyou100.gym.service.imp;

import com.zhiyou100.gym.mapper.mainRecordMapper;
import com.zhiyou100.gym.pojo.mainRecord;
import com.zhiyou100.gym.service.mainRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class mainRecordServiceImp  implements mainRecordService {
    @Autowired
    private mainRecordMapper mainRecordMapper;
    @Override
    public void insermainRecord(mainRecord mainRecord) {
        Date date = new Date();
        mainRecord.setMainRecordNumber(Integer.valueOf((int) date.getTime()));
        Date time1= new java.sql.Date(new Date().getTime());
        mainRecord.setMainRecordTime((java.sql.Date) time1);
        mainRecordMapper.insert(mainRecord);
    }

    @Override
    public void deletemainRecord(Integer id) {
        mainRecordMapper.deleteById(id);
    }

    @Override
    public void updatemainRecord(mainRecord mainRecord) {
        mainRecordMapper.updateById(mainRecord);
    }

    @Override
    public List<mainRecord> selectAllmainRecord() {
        return mainRecordMapper.selectList(null);
    }
}
