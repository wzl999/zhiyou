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
@TableName(value = "gym_cab_info")
public class gymCabInfo {
    @TableId(value = "cab_info_id",type = IdType.AUTO)
    private Integer cabInfoId;
    @TableField(value = "cab_info_number")
    private Integer cabInfoNumber;
    @TableField(value = "cab_info_price")
    private Integer cabInfoPrice;
    @TableField(value = "cab_info_duration")
    private Integer cabInfoDuration;
    @TableField(value = "cab_info_create_time")
    private Date cabInfoCreateTime;
    @TableField(value = "cab_info_update_time")
    private Date cabInfoUpdateTime;
    @TableField(value = "cab_info_member")
    private Integer cabInfoMember;
    @TableField(value = "cab_info_status")
    private Integer cabInfoStatus;


}
