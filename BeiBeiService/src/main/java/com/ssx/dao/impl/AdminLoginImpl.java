package com.ssx.dao.impl;

import com.ssx.dao.AdminLoginDao;
import com.ssx.entity.Admin;
import com.ssx.interfaces.AdminLoginInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminLoginImpl implements AdminLoginInterface {

    @Autowired
    private AdminLoginDao adminLoginDao;


    public void aaa() {

    }

    public Admin doLogin(String adminid, String pwd) {
        return adminLoginDao.doLogin(adminid,pwd);
    }
}
