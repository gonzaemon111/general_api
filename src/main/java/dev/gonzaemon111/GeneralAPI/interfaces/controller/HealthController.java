package dev.gonzaemon111.GeneralAPI.interfaces.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

  @RequestMapping(value="/health", method=RequestMethod.GET)
  public String index() {
    return "OK";
  }
}
