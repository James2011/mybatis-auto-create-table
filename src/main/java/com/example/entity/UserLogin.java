package com.example.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import lombok.Data;

/**
 * 第三种定义方式，懒人定义，按照驼峰规则转换
 * 不需要对每个字段设置@Column
 * 这里没有继承BaseModel，因为BaseModel离有OrderBy等参数，也会对其进行构建字段
 *
 * @author 徐森威
 * @date 2020/12/24
 */

@Table(isSimple = true)
@Data
public class UserLogin {

	@IsKey
	@IsAutoIncrement
	private Integer	id;

	private String	name;

	private String	type;
}
