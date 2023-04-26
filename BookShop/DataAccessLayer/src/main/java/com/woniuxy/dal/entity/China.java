package com.woniuxy.dal.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author woniumrwang
 * @since 2023-04-26 11:40:03
 */
@Getter
@Setter
@TableName("t_china")
public class China {

    @TableId("Id")
    private Integer id;

    @TableField("Name")
    private String name;

    @TableField("Pid")
    private Integer pid;


}
