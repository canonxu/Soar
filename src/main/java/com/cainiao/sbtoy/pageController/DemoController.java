package com.cainiao.sbtoy.pageController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class DemoController {

    @Value("${management.port}")
    private String managePort;

    @GetMapping("/")
    public String root() {
        return "index";
    }

    @GetMapping("/tddl")
    public String tddl() {
        return "tddl  haolehaole,shuijiaole,,,,,,,,,,+++";
    }

    @GetMapping("/hsf")
    public String hsf() {
        return "hsf";
    }

    @GetMapping("/diamond")
    public String diamond() {
        return "diamond";
    }

    @GetMapping("/tair")
    public String tair() {
        return "tair";
    }

    /**
     * 健康检查
     */
    @GetMapping("/checkpreload.htm")
    public @ResponseBody
    String checkPreload() {
        return "success";
    }

    @GetMapping("manage_port")
    @ResponseBody
    public String managePort() {
        return managePort;
    }

}
