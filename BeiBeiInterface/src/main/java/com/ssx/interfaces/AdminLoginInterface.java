package com.ssx.interfaces;

import com.ssx.entity.Admin;



public interface AdminLoginInterface {
    public void aaa();
    /**
     *查询所有管理员并在页面判断管理员权限
     */
    public Admin doLogin(String adminid,String pwd);
}
