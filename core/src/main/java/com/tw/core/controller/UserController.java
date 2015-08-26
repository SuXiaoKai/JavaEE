package com.tw.core.controller;

import com.tw.core.entity.User;
import com.tw.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ksu on 7/13/15.
 */
@RestController
@RequestMapping(value="/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value ="/users", method = RequestMethod.GET)
    public ModelAndView getUserList(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("users", userService.all());
        return modelAndView;
    }

    @RequestMapping(value ="/user", method = RequestMethod.POST)
    public ModelAndView addUser(@RequestParam String name,@RequestParam String sex, @RequestParam String mail, @RequestParam int age){
        User user = new User(null,name,sex, mail,age);
        userService.add(user);
        return new ModelAndView("redirect:/users");
    }
}
