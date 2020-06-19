package com.abhiani.project.microServicesProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MicroServiceController {
    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

}
