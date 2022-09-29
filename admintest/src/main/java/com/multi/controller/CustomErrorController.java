package com.multi.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//모든 exception들은 이 controller에서 처리함!!
@ControllerAdvice
public class CustomErrorController {
    @ExceptionHandler(Exception.class)  
    public String except(Exception e, Model model){
    	//e.getmessage:ID 중복 에러
        model.addAttribute("msg",e.getMessage());
        model.addAttribute("center","error/error_page1");
        return "index";
    }
}