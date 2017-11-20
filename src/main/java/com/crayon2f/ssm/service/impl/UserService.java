package com.crayon2f.ssm.service.impl;

import com.crayon2f.ssm.dao.UserDao;
import com.crayon2f.ssm.model.User;
import com.crayon2f.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by feiFan.gou on 2017/11/20 16:45.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User selectById(Integer id) {

        return userDao.selectById(id);
    }
}
