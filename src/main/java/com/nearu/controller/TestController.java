package com.nearu.controller;

import com.nearu.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("test")
public class TestController {
    @Resource
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String test(ModelMap model){
        model.addAttribute("name", "Hello World");
        return "index";
    }

    @RequestMapping(value = "tinsert",method = RequestMethod.GET)
    @ResponseBody
    public String insertDB(){
        userService.addUser();
        return "ok";
    }
}
