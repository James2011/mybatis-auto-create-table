package com.example.entity;


import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

/**
 * 第二种定义方式，使用@Table和@Column定义字段，具体内容用具体注解定义
 * 例如@Id，@IsNotNull，@isAutoIncrement等等
 * 如果没有设置name，会直接把变量名按照驼峰规则转换，如果没有设置类型也会自动转换Java的类型到SQL类型
 *
 * @auther 徐森威
 * @date 2020/12/24
 */
@Table(name = "test1")
@Data
public class Test1 extends BaseModel {

    @Id
    @IsAutoIncrement
    @Column
    private Integer	id;

    @Column
    private Double price;

    @Column
    @ColumnType(value = MySqlTypeConstant.VARCHAR, length = 455)
    private String name;

    @Column
    private Date time;

}
