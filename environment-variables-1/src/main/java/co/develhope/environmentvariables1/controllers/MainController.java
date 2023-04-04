package co.develhope.environmentvariables1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
@Value("${myCustomProps.authCode}")
String authCode;
@Value("${myCustomProps.devName}")
String devName;

@GetMapping("/getProperty")
    public String properties(){
    return "Welcome "+devName+" this is your authCode: "+authCode;
    }

}