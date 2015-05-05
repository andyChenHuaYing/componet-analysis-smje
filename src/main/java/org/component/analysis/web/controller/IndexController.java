package org.component.analysis.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by andychen on 2015/5/5.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@Controller
@RequestMapping("/index.spr")
public class IndexController {

    @RequestMapping(params = "method=index")
    public String index() {
        return "error/400";
    }
}
