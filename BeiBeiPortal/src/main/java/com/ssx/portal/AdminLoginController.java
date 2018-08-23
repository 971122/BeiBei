package com.ssx.portal;

import com.ssx.interfaces.AdminLoginInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class AdminLoginController {

    @Autowired
    private AdminLoginInterface adminLoginInterface;
    public void test(){

    }


    public String doLogin(Admin admin, Model model){
        if (admin != null && admin.equals("")) {
            admin= adminLoginInterface.doLogin(admin.getAdminid(), admin.getPwd());
            model.addAttribute("admin",admin);
            return "";
        }else {
            return "";
        }

    }
}
