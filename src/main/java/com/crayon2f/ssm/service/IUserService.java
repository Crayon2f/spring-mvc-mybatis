package com.crayon2f.ssm.service;

import com.crayon2f.ssm.model.User;

/**
 * Created by feiFan.gou on 2017/11/20 16:45.
 */
public interface IUserService {

    User selectById(Integer id);
}
