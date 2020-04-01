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
@TableName(value = "gym_approach")
public class gymApproach {

    @TableId(value = "app_id",type = IdType.AUTO)
    private Integer appId;
    @TableField(value = "app_member_id")
    private Integer appMemberId;
    @TableField(value = "app_number")
    private Integer appNumber;
    @TableField(value = "app_create_time")
    private Date appCreateTime;
    @TableField(value = "app_update_time")
    private Date appUpdateTime;
    @TableField(value = "app_status")
    private Integer appStatus;

}
