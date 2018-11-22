package com.capable.springboot.controller;

import com.capable.springboot.pojo.VueLoginInfoVo;
import com.capable.springboot.result.Result;
import com.capable.springboot.result.ResultFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Objects;


@Controller
@RequestMapping("/api")
public class LoginController {

    @CrossOrigin
    @RequestMapping(value = "/loginController/checkUser",method = RequestMethod.POST , produces = "application/json; charset=UTF-8" )
    @ResponseBody
    public Result checkUser(@Valid @RequestBody VueLoginInfoVo loginInfoVo, BindingResult bindingResult){

        System.out.println(loginInfoVo.getUserName()+"================");
        System.out.println(loginInfoVo.getUserName()+"================");

        return ResultFactory.buildSuccessResult("登陆成功。");
    }

}
