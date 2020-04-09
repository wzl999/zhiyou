package com.zhiyou100.gym.service.imp;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhiyou100.gym.entity.Chinese2PinYinUtils;
import com.zhiyou100.gym.mapper.personalTrainerMapper;
import com.zhiyou100.gym.pojo.Paike;
import com.zhiyou100.gym.pojo.personalTrainer;
import com.zhiyou100.gym.service.personalTrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class personalTrainerServiceImp implements personalTrainerService {
    @Autowired
    private personalTrainerMapper personalTrainerMapper;
    private  final Integer size=4;
    @Override
    public IPage<personalTrainer> selectAllpersonalTrainer(Integer page) {
        if(page==null || page <=0){
            page=1;
        }
        IPage<personalTrainer> objectPage = new Page<>(page, size);
        objectPage=  personalTrainerMapper.selectPage(objectPage, null);
      /*  List<personalTrainer> records = objectPage.getRecords();
        long size = objectPage.getSize();
        System.out.println(size);
        System.out.println(objectPage.getPages());*/
        return objectPage;
    }

    @Override
    public List<personalTrainer> selectAll() {
        return personalTrainerMapper.selectList(null);
    }

    @Override
    public void updatepersonalTrainer(personalTrainer personalTrainer) {
        personalTrainerMapper.updateById(personalTrainer);
    }

    @Override
    public void insertpersonalTrainer(personalTrainer personalTrainer) {
        Date date = new Date();
        personalTrainer.setPersonalTrainerNumber(Integer.valueOf((int) date.getTime()));
        String s = Chinese2PinYinUtils.trans2PinYin(personalTrainer.getPersonalTrainerName());
        personalTrainer.setPersonalTraninerAccount(s+"jiaolian");
        personalTrainer.setPersonalTraninerPassword(s+"jiaolian");
        personalTrainerMapper.insert(personalTrainer);
    }

    @Override
    public void deletepersonalTrainer(Integer id) {
        personalTrainerMapper.deleteById(id);
    }

    @Override
    public personalTrainer selectPByid(Integer id) {
        return personalTrainerMapper.selectById(id);
    }
}
