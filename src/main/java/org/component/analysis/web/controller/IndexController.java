package org.component.analysis.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by andychen on 2015/5/5.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@Controller
public class IndexController {

    @RequestMapping("/hello.spr")
    public String index() {
        System.out.println("============");
        return "home";
    }
}
