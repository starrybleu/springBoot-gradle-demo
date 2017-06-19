package com.bean.controller;

import com.bean.service.UserService;
import com.bean.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mac on 2017. 6. 18..
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public String list(Model model) {
        System.out.println(userService.findAll());
        model.addAttribute("list", userService.findAll());
        return "user/list";
    }

    @GetMapping("/add")
    public String add() {
        return "user/add";
    }

    @PostMapping("/add")
    public String postUser(User user) {
        userService.save(user);
        return "redirect:/user/list";
    }

    @GetMapping("/modify/{userid}")
    public String mod(@PathVariable String userid, Model model){
        User user = userService.findById(userid);
        model.addAttribute("data", user);
        return "user/modify";
    }

    @PostMapping("/modify")
    public String postModify(User user) {
        userService.save(user);
        return "redirect:/user/list";
    }

    @RequestMapping("/delete/{userid}")
    public String delete(@PathVariable String userid) {
        userService.delete(userid);
        return "redirect:/user/list";
    }

}
