package org.devtech.messageingapp.controller;


import org.devtech.messageingapp.model.FilteringBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringBeanController {

    @GetMapping("/filtering")
    public FilteringBean getFilterBean(){
        return  new FilteringBean("Value1","value2", "value3");
    }
    @GetMapping("/filtering-list")
    public List<FilteringBean> getAllFilterBean(){
        return Arrays.asList(
                new FilteringBean("Value1","value2", "value3"),
                new FilteringBean("Value11","value22", "value33"),
                new FilteringBean("Value12","value23", "value34")
        );
    }

}
