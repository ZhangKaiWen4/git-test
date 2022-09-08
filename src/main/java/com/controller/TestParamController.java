package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestParamController {
    @RequestMapping(value = {"/aa"})
    public String getParam1(String username,String password){
        return "success";
    }

    @RequestMapping(value = {"/test/mav"})
    public ModelAndView testMAV(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("AA","success");
        mav.setViewName("success");
        return mav;
    }
}
