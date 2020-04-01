package com.zhiyou100.gym.Controller;

import com.zhiyou100.gym.pojo.gymUser;
import com.zhiyou100.gym.service.gymUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "gymUser")
public class gymUserController {

    @Autowired
    private gymUserService gymUserService;

    @RequestMapping(value = "gymUserAll")
    public List<gymUser> gymUserAll(){

        return gymUserService.queryAll();
    }

}
