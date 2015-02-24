package com.github.vladislav719.controller;

import com.github.vladislav719.model.vo.User;
import com.github.vladislav719.service.FlatService;
import com.github.vladislav719.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Владислав on 28.11.2014.
 */
@Controller
@RequestMapping("user")
public class UserController {

    private UserService userService;



    private FlatService flatService;

    @Autowired
    @Qualifier(value = "flatService")
    public void setFlatService(FlatService flatService) {
        this.flatService = flatService;
    }
    @Autowired(required = true)
    @Qualifier(value = "userService")
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/1", method = RequestMethod.GET)
    public String listUsers(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("listUsers", this.userService.getUserList());
        return "users";
    }

    @RequestMapping(value = "flats",method = RequestMethod.GET)
    public String renderRequestedPage(Model model) {
        model.addAttribute("listFlats", flatService.flats());
        return "flats";
    }
}
