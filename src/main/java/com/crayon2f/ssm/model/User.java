package com.crayon2f.ssm.model;

import lombok.Data;

import java.util.Date;

/**
 * Created by feiFan.gou on 2017/11/20 15:02.
 */
@Data
public class User {

    private Integer id;
    private String name;
    private Integer age;
    private Date birthday;
    private String mobile;
    private String email;
    private String introduce;
}
