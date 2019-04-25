package com.dh.shiro.shirodemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dh.shiro.shirodemo.entity.TUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Created with IDEA
 * @author:DaiHang
 * @Date:2019/4/25
 * @Time:18:04
 */
@Mapper
public interface UserMapper extends BaseMapper<TUser> {

}
