package com.yq.controller;

import com.yq.config.MyConfig;
import com.yq.config.ServerConfig;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class HelloController {

    @Autowired
    private ServerConfig serverConfig;

    @Autowired
    private MyConfig myConfig;

    @GetMapping("/port")
    @ApiOperation("get server port service")
    @ApiImplicitParams({
    })
    public String getPort() {
        return "server port " + serverConfig.getPort();
    }

    @GetMapping("/portByProperties")
    @ApiOperation("get server port config")
    @ApiImplicitParams({
    })
    public String getPortByConfig() {
        return "server port " + myConfig.getPort();
    }

    @GetMapping("/hello")
    @ApiOperation("hello world rest demo")
    @ApiImplicitParams({
    })
    public String handle() {
        return "Hello World";
    }
}