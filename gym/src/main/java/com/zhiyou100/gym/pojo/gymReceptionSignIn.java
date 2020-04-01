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
@TableName(value = "gym_reception_sign_in")
public class gymReceptionSignIn {

    @TableId(value = "rec_sign_id",type = IdType.AUTO)
    private Integer recSignId;
    @TableField(value = "rec_sign_number")
    private Integer recSignNumber;
    @TableField(value = "rec_sign_create_time")
    private Date recSignCreateTime;
    @TableField(value = "rec_sign_people_id")
    private Integer recSignPeopleId;
    @TableField(value = "rec_sign_remark")
    private String recSignRemark;
    @TableField(value = "rec_sign_status")
    private Integer recSignStatus;
}
