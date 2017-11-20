package com.crayon2f.ssm.controller;

import com.crayon2f.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by feiFan.gou on 2017/11/20 16:42.
 */
@Controller
@RequestMapping("/")
public class IndexController  {

    @Autowired
    private IUserService service;
    @RequestMapping("/")
    public ModelAndView index() {

        ModelAndView view = new ModelAndView("index");
        view.addObject("user", service.selectById(1));
        return view;
    }
}
