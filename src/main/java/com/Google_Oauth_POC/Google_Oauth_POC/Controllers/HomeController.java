package com.Google_Oauth_POC.Google_Oauth_POC.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String homePage(){
        return "Hello, welcome home, Backend is running";
    }
}
