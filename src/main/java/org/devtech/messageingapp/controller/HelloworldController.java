package org.devtech.messageingapp.controller;

import org.devtech.messageingapp.model.HelloWorlBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping( path = "/hello-world-bean")
    public HelloWorlBean helloWorldBean(){
        return new HelloWorlBean("Hello World Bean");
    }

    ///hello-world/path-variable/Aditya
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorlBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorlBean(String.format("Hello World, %s", name));
    }

}
