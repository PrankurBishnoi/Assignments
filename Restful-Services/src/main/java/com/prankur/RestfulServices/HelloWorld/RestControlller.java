package com.prankur.RestfulServices.HelloWorld;

import com.prankur.RestfulServices.HelloWorld.HelloWorldBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class RestControlller
{
    @Autowired
    private MessageSource messageSource;

    @GetMapping("/HelloWorld")
    public String helloWorld()
    {
        return "Hello World.";
    }

//    Use Bean
//    @GetMapping(path = "HelloWorldBean")
//    public HelloWorldBean showBean()
//    {
//        return (new HelloWorldBean("Hello World Bean."));
//    }

//    Use Path Variable
//    @GetMapping(path = "HelloWorldBean/pathVariable/{i}/{j}")
//    public HelloWorldBean helloWorldPathvariable(@PathVariable int i,@PathVariable int j)
//    {
//        int k=i*j;
//        return (new HelloWorldBean(String.format("Hello World Bean, %d",k)));
//    }
//
//
    @PostMapping(path = "/post")
    public void postMethod(@RequestBody HelloWorldBean hello)
    {

    }
    @GetMapping(path = "/gmintern")
    public String helloWorldIntern(@RequestHeader(name = "Accept-Language", required=false) Locale locale)
    {
        return messageSource.getMessage("good.morning.message",null, locale);
    }
}