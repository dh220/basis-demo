package com.dh.shiro.shirodemo.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Created with IDEA
 * @author:DaiHang
 * @Date:2019/4/25
 * @Time:17:59
 */
@Data
public class TUser {
    Long id;
    /**
     * '用户昵称'
     */
    String nickname;
    /**
     *  邮箱|登录帐号'
     */
    String email;
    /**
     *密码'
     */
    String pswd;
    /**
     * 创建时间'
     */
    Date create_time;
    /**
     * '最后登录时间'
     */
    Date last_login_time;
    /**
     *1:有效，0:禁止登录'
     */
    Long status;
}
