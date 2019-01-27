# messageing-app
# Swagger API

##update pom.xml
```
    <dependency>
        <groupId>io.springfox</groupId>
        <artifactId>springfox-swagger2</artifactId>
        <version>2.4.0</version>
    </dependency>

    <dependency>
        <groupId>io.springfox</groupId>
        <artifactId>springfox-swagger-ui</artifactId>
        <version>2.4.0</version>
    </dependency>
```
# Swagger Configuration
##SwaggerConfig.java
```
package org.devtech.messageingapp.congig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//Configuration
@Configuration
//Enable Swagger
@EnableSwagger2
`
public class SwaggerConfig {

    //Define Bean- Docket
        //Configure
            //Swager2
            //All the Paths
            //All the apis
    @Bean
    public Docket api(){
        return  new Docket(DocumentationType.SWAGGER_2);
    }
}
```