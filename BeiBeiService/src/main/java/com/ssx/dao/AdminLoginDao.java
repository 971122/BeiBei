package com.ssx.dao;

import com.ssx.entity.Admin;
import org.apache.ibatis.annotations.Select;


public interface AdminLoginDao {
    /**
     *查询所有管理员并在页面判断管理员权限
     */
    @Select("select * from Admin where adminid = #{adminid} and pwd = #{pwd}")
    public Admin doLogin(String adminid, String pwd);
}
