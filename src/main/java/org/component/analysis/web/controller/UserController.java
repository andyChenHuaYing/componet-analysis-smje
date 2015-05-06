package org.component.analysis.web.controller;

import org.component.analysis.web.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    @Qualifier("userServiceImpl")
    private IUserService userService;

    @RequestMapping("/user")
    public String userCount(Model model) {
        logger.debug("DEBUG USER");
        logger.info("INFO");
        logger.warn("WARN");
        logger.error("ERROR");
        model.addAttribute("personCount", this.userService.selectUserCount());
        return "home";
    }
}
