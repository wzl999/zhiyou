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
@TableName(value = "gym_user")
public class gymUser {
    @TableId(value = "use_id",type = IdType.AUTO)
    private Integer useId;
    @TableField(value = "use_account")
    private String useAccount;
    @TableField(value = "use_password")
    private String usePassword;
    @TableField(value = "use_status")
    private Integer useStatus;

}
