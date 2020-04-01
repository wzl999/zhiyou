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
@TableName(value = "gym_cabinet")
public class gymCabinet {

    @TableId(value = "cab_id",type = IdType.AUTO)
    private Integer cabId;
    @TableField(value = "cab_number")
    private Integer cabNumber;
    @TableField(value = "cab_capacity")
    private Integer cabCapacity;
    @TableField(value = "cab_status")
    private Date cabStatus;

}
