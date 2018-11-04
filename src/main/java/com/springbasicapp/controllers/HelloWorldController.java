package com.springbasicapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

  @RequestMapping(path = "/", method = RequestMethod.GET)
  @ResponseBody
  public String hello() {
    return "hello world";
  }

}
