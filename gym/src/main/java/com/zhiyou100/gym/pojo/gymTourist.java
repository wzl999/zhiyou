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
@TableName(value = "gym_tourist")
public class gymTourist {
    @TableId(value = "tou_id",type = IdType.AUTO)
    private Integer touId;
    @TableField(value = "tou_number")
    private Integer touNumber;
    @TableField(value = "tou_contact")
    private Long touContact;
    @TableField(value = "tou_sex")
    private String touSex;
    @TableField(value = "tou_create_time")
    private Date touCreateTime;
    @TableField(value = "tou_remark")
    private String touRemark;
    @TableField(value = "tou_occupation")
    private String touOccupation;
    @TableField(value = "tou_hobby")
    private String touHobby;
    @TableField(value = "tou_address")
    private String touAddress;
    @TableField(value = "tou_status")
    private Integer touStatus;

}
