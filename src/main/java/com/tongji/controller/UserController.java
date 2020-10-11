package com.tongji.controller;

import com.tongji.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
@Api(tags = "UserController", description = "用户信息管理")
public class UserController
{
    @Autowired
    private UserService userService;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation("获取用户信息")
    public String test()
    {
        userService.select(1);
        return ".toString()";
    }
}
