package org.devtech.messageingapp.controller;

import org.devtech.messageingapp.model.HelloWorlBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

//Controller
@RestController
public class HelloworldController {

    @Autowired
    private MessageSource messageSource;

    //GET
    //URI- "gello-world"
    //method- "Hello World"

   // @RequestMapping(method = RequestMethod.GET, path = "/hellow-world")
   @GetMapping( path = "/hello-world")
    public String helloWorld(){
        return  "Hello World!";
    }

    @GetMapping( path = "/hello-world-bean")
    public HelloWorlBean helloWorldBean(){
        return new HelloWorlBean("Hello World Bean");
    }

    ///hello-world/path-variable/Aditya
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorlBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorlBean(String.format("Hello World, %s", name));
    }

    @GetMapping(path = "/hello-world-internationalized")
    public String helloworldInternationalized(
            @RequestHeader(name ="Accept-Language", required = false)
                    Locale locale) {
        String message = messageSource.getMessage("good.morning.message",
                null, locale);
        return message;
        //return "Hello";
    }
    ///hello-world/path-variable/Aditya

}
