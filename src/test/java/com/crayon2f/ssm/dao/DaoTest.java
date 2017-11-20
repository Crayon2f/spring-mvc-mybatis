package com.crayon2f.ssm.dao;

import com.crayon2f.ssm.SpringTest;
import com.crayon2f.ssm.model.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by feiFan.gou on 2017/11/20 15:35.
 */
public class DaoTest extends SpringTest {

    @Autowired
    private UserDao dao;

    @Test
    public void selectById() {

        User user = dao.selectById(1);
        if (null != user) {
            System.out.println(user.getName());
        }
    }

}
