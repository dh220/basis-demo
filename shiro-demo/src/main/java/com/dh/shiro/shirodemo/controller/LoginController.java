package com.dh.shiro.shirodemo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dh.shiro.shirodemo.entity.TUser;
import com.dh.shiro.shirodemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created with IDEA
 * @author:DaiHang
 * @Date:2019/4/25
 * @Time:15:12
 */
@Controller
@RequestMapping("/user")
@Slf4j
public class LoginController {
    @Autowired
    UserService userService;


    @RequestMapping("/getUser")
    @ResponseBody
    public JSONObject getUser(@RequestParam("name") String name){
        TUser user = new TUser();
        user.setNickname(name);
        user = userService.queryUser(user);
        JSONObject json = JSONObject.parseObject(JSON.toJSONString(user));
        log.info("JSON值为{}",json);
        return json;
    }

}
