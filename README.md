# messageing-app
# Static Filtering

```
package org.devtech.messageingapp.model;

public class FilteringBean {
    private String field1;
    private String field2;
    private String field3;

    public FilteringBean(String field1, String field2, String field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }
}


```

```$xslt
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

```
####I/P:
```$xslt
 {{contextPath}}/filtering
```
####O/P: 
```
{
    "field1": "Value1",
    "field2": "value2",
    "field3": "value3"
}

```
####I/P:
```$xslt
 {{contextPath}}/filtering-list
```
####O/P: 
```
[
    {
        "field1": "Value1",
        "field2": "value2",
        "field3": "value3"
    },
    {
        "field1": "Value11",
        "field2": "value22",
        "field3": "value33"
    },
    {
        "field1": "Value12",
        "field2": "value23",
        "field3": "value34"
    }
]

```

