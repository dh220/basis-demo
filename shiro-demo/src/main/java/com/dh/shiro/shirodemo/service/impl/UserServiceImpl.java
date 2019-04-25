package com.dh.shiro.shirodemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dh.shiro.shirodemo.dao.UserMapper;
import com.dh.shiro.shirodemo.entity.TUser;
import com.dh.shiro.shirodemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Created with IDEA
 * @author:DaiHang
 * @Date:2019/4/25
 * @Time:18:06
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public TUser queryUser(TUser user) {
        QueryWrapper<TUser> query  = new QueryWrapper<>();
        query.eq("nickname",user.getNickname());
        return userMapper.selectOne(query);
    }
}
