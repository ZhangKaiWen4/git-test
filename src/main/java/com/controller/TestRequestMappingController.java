package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @RequestMapping注解的method属性
 * 作用:通过请求的请求方式匹配请求
 * method属性是RequestMethod类型的数组,即当前浏览器所发送请求的请求方式匹配method
 */
@Controller
//@RequestMapping("/test")
public class TestRequestMappingController {
    //此时控制器方法所匹配的请求的请求路径为/test/hello
    @RequestMapping(
//            value = {"/hello","/abc"},
//            method = {RequestMethod.POST,RequestMethod.GET}
//            params = {"username","!password","age=20","gender!=女"}
    )
    public String hello(){
        return "success";
    }
    @RequestMapping("/a?a/test/ant")
    public String testAnt(){
        return "success";
    }
    @RequestMapping("/a*a/test/ant")
    public String testAnt2(){
        return "success";
    }
    @RequestMapping("/test/rest/{username}/{id}")
    public String testRest(@PathVariable("id") Integer id,@PathVariable("username")String username){
        System.out.println(username+" : "+id);
        return "success";
    }




}
