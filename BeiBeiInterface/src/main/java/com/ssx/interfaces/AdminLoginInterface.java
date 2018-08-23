package com.ssx.interfaces;


public interface AdminLoginInterface {
    /**
     *查询所有管理员并在页面判断管理员权限
     */
    public Admin doLogin(String adminid,String pwd);

}
