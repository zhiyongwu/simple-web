package com.simple.simpleweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuzhiyong (wzy@rsvptech.cn)
 * @since 2022/5/3
 */
@RestController
public class SimpleRestController {

  @GetMapping("/")
  public String index() {
    return "simple web service running...";
  }
}
