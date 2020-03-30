package com.prankur.springSecurity.security;

import org.springframework.web.bind.annotation.GetMapping;
@org.springframework.web.bind.annotation.RestController
public class RestController
{

    @GetMapping("/")
    public String index()
    {
        return "index";
    }

    @GetMapping("/admin/home")
    public String adminHome()
    {
        return "Admin Home Page";
    }

    @GetMapping("/user/home")
    public String userHome()
    {
        return "User Home Page";
    }

}
