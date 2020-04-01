package com.zhiyou100.gym.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@TableName(value = "gym_member")
public class gymMember {
    @TableId(value = "mem_id",type = IdType.AUTO)
    private Integer memId;
    @TableField(value = "mem_number")
    private Integer memNumber;
    @TableField(value = "mem_name")
    private String memName;
    @TableField(value = "mem_sex")
    private String memSex;
    @TableField(value = "mem_age")
    private Integer memAge;
    @TableField(value = "mem_contact")
    private Long memContact;
    @TableField(value = "mem_status")
    private Integer memStatus;


}
