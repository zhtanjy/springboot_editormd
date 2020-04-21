package com.tan.md.test03.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 谭俊彦
 * @version 1.0 2020-04-21 10:41
 * @description
 */
@Controller
public class SimpleController {

    @GetMapping("/simple")
    public String simple(){
        return "simple";
    }

    @GetMapping("/full")
    public String full(){
        return "full";
    }
}
