package com.crayon2f.ssm.dao;

import com.crayon2f.ssm.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by feiFan.gou on 2017/11/20 15:16.
 */
public interface UserDao {

    User selectById(@Param("id") Integer id);
}
