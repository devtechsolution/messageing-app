package org.devtech.messageingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//Controller
@RestController
public class HelloworldController {

    //GET
    //URI- "gello-world"
    //method- "Hello World"

   // @RequestMapping(method = RequestMethod.GET, path = "/hellow-world")
   @GetMapping( path = "/hello-world")
    public String helloWorld(){
        return  "Hello World!";
    }
}
