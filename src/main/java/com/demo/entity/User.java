package com.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@ApiModel(value = "用户实体类",description = "用户实体类")
public class User {

    @ApiModelProperty(value = "用户Id")
    private Integer userId;

    @ApiModelProperty(value = "用户账户名")
    private String userName;

    @ApiModelProperty(value = "用户密码")
    private String userPassword;
}
