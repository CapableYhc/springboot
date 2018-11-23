package com.capable.springboot.controller;

import com.capable.springboot.pojo.User;
import com.capable.springboot.pojo.VueLoginInfoVo;
import com.capable.springboot.result.Result;
import com.capable.springboot.result.ResultFactory;
import com.capable.springboot.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


@Controller
@RequestMapping("/api/loginController")
public class LoginController {

    @Autowired
    private UserService userService;

    @CrossOrigin
    @RequestMapping(value = "/checkUser",method = RequestMethod.POST , produces = "application/json; charset=UTF-8" )
    @ResponseBody
    public Result checkUser(@Valid @RequestBody VueLoginInfoVo loginInfoVo, BindingResult bindingResult){

        User user = userService.getUserById(loginInfoVo.getUserName());
        System.out.println("user:"+user.toString());
        System.out.println(loginInfoVo.getUserName()+"================");
        System.out.println(loginInfoVo.getUserName()+"================");

        return ResultFactory.buildSuccessResult("登陆成功。");
    }

}
