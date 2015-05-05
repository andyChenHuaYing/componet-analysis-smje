package org.component.analysis.web.controller;

import org.component.analysis.web.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by andychen on 2015/5/4.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@Controller("userController")
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    private IUserService userService;

    @RequestMapping("/user")
    public String userCount(Model model) {
        model.addAttribute("personCount", this.userService.selectUserCount());
        return "home";
    }
}
