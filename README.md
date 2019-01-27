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

#Swagger Documentation Format

```
{
swagger: "2.0",
info: {},
host: "localhost:7788",
basePath: "/",
tags: [],
paths: {},
definitions: {}
}

```

```
{
swagger: "2.0",
info: {
description: "Api Documentation",
version: "1.0",
title: "Api Documentation",
termsOfService: "urn:tos",
contact: { },
license: {
name: "Apache 2.0",
url: "http://www.apache.org/licenses/LICENSE-2.0"
}
},
host: "localhost:7788",
basePath: "/",
tags: [
{
name: "helloworld-controller",
description: "Helloworld Controller"
},
{
name: "user-controller",
description: "User Controller"
},
{
name: "basic-error-controller",
description: "Basic Error Controller"
}
],
paths: {
/error: {
get: {
tags: [
"basic-error-controller"
],
summary: "errorHtml",
operationId: "errorHtmlUsingGET",
consumes: [
"application/json"
],
produces: [
"text/html"
],
responses: {
200: {
description: "OK",
schema: {
$ref: "#/definitions/ModelAndView"
}
},
401: {
description: "Unauthorized"
},
403: {
description: "Forbidden"
},
404: {
description: "Not Found"
}
}
},
head: {
tags: [
"basic-error-controller"
],
summary: "errorHtml",
operationId: "errorHtmlUsingHEAD",
consumes: [
"application/json"
],
produces: [
"text/html"
],
responses: {
200: {
description: "OK",
schema: {
$ref: "#/definitions/ModelAndView"
}
},
204: {
description: "No Content"
},
401: {
description: "Unauthorized"
},
403: {
description: "Forbidden"
}
}
},
post: {
tags: [
"basic-error-controller"
],
summary: "errorHtml",
operationId: "errorHtmlUsingPOST",
consumes: [
"application/json"
],
produces: [
"text/html"
],
responses: {
200: {
description: "OK",
schema: {
$ref: "#/definitions/ModelAndView"
}
},
201: {
description: "Created"
},
401: {
description: "Unauthorized"
},
403: {
description: "Forbidden"
},
404: {
description: "Not Found"
}
}
},
put: {
tags: [
"basic-error-controller"
],
summary: "errorHtml",
operationId: "errorHtmlUsingPUT",
consumes: [
"application/json"
],
produces: [
"text/html"
],
responses: {
200: {
description: "OK",
schema: {
$ref: "#/definitions/ModelAndView"
}
},
201: {
description: "Created"
},
401: {
description: "Unauthorized"
},
403: {
description: "Forbidden"
},
404: {
description: "Not Found"
}
}
},
delete: {
tags: [
"basic-error-controller"
],
summary: "errorHtml",
operationId: "errorHtmlUsingDELETE",
consumes: [
"application/json"
],
produces: [
"text/html"
],
responses: {
200: {
description: "OK",
schema: {
$ref: "#/definitions/ModelAndView"
}
},
204: {
description: "No Content"
},
401: {
description: "Unauthorized"
},
403: {
description: "Forbidden"
}
}
},
options: {
tags: [
"basic-error-controller"
],
summary: "errorHtml",
operationId: "errorHtmlUsingOPTIONS",
consumes: [
"application/json"
],
produces: [
"text/html"
],
responses: {
200: {
description: "OK",
schema: {
$ref: "#/definitions/ModelAndView"
}
},
204: {
description: "No Content"
},
401: {
description: "Unauthorized"
},
403: {
description: "Forbidden"
}
}
},
patch: {
tags: [
"basic-error-controller"
],
summary: "errorHtml",
operationId: "errorHtmlUsingPATCH",
consumes: [
"application/json"
],
produces: [
"text/html"
],
responses: {
200: {
description: "OK",
schema: {
$ref: "#/definitions/ModelAndView"
}
},
204: {
description: "No Content"
},
401: {
description: "Unauthorized"
},
403: {
description: "Forbidden"
}
}
}
},
/hello-world: {
get: {
tags: [
"helloworld-controller"
],
summary: "helloWorld",
operationId: "helloWorldUsingGET",
consumes: [
"application/json"
],
produces: [
"*/*"
],
responses: {
200: {
description: "OK",
schema: {
type: "string"
}
},
401: {
description: "Unauthorized"
},
403: {
description: "Forbidden"
},
404: {
description: "Not Found"
}
}
}
},
/hello-world-bean: {
get: {
tags: [
"helloworld-controller"
],
summary: "helloWorldBean",
operationId: "helloWorldBeanUsingGET",
consumes: [
"application/json"
],
produces: [
"*/*"
],
responses: {
200: {
description: "OK",
schema: {
$ref: "#/definitions/HelloWorlBean"
}
},
401: {
description: "Unauthorized"
},
403: {
description: "Forbidden"
},
404: {
description: "Not Found"
}
}
}
},
/hello-world-internationalized: {
get: {
tags: [
"helloworld-controller"
],
summary: "helloworldInternationalized",
operationId: "helloworldInternationalizedUsingGET",
consumes: [
"application/json"
],
produces: [
"*/*"
],
parameters: [
{
name: "Accept-Language",
in: "header",
description: "Accept-Language",
required: false,
type: "ref"
}
],
responses: {
200: {
description: "OK",
schema: {
type: "string"
}
},
401: {
description: "Unauthorized"
},
403: {
description: "Forbidden"
},
404: {
description: "Not Found"
}
}
}
},
/hello-world/path-variable/{name}: {
get: {
tags: [
"helloworld-controller"
],
summary: "helloWorldPathVariable",
operationId: "helloWorldPathVariableUsingGET",
consumes: [
"application/json"
],
produces: [
"*/*"
],
parameters: [
{
name: "name",
in: "path",
description: "name",
required: true,
type: "string"
}
],
responses: {
200: {
description: "OK",
schema: {
$ref: "#/definitions/HelloWorlBean"
}
},
401: {
description: "Unauthorized"
},
403: {
description: "Forbidden"
},
404: {
description: "Not Found"
}
}
}
},
/user/{id}: {
get: {
tags: [
"user-controller"
],
summary: "getUserById",
operationId: "getUserByIdUsingGET",
consumes: [
"application/json"
],
produces: [
"*/*"
],
parameters: [
{
name: "id",
in: "path",
description: "id",
required: true,
type: "integer",
format: "int64"
}
],
responses: {
200: {
description: "OK",
schema: {
$ref: "#/definitions/Resource«User»"
}
},
401: {
description: "Unauthorized"
},
403: {
description: "Forbidden"
},
404: {
description: "Not Found"
}
}
},
delete: {
tags: [
"user-controller"
],
summary: "deleteUserById",
operationId: "deleteUserByIdUsingDELETE",
consumes: [
"application/json"
],
produces: [
"*/*"
],
parameters: [
{
name: "id",
in: "path",
description: "id",
required: true,
type: "integer",
format: "int64"
}
],
responses: {
200: {
description: "OK"
},
204: {
description: "No Content"
},
401: {
description: "Unauthorized"
},
403: {
description: "Forbidden"
}
}
}
},
/users: {
get: {
tags: [
"user-controller"
],
summary: "getAllUsers",
operationId: "getAllUsersUsingGET",
consumes: [
"application/json"
],
produces: [
"*/*"
],
responses: {
200: {
description: "OK",
schema: {
type: "array",
items: {
$ref: "#/definitions/User"
}
}
},
401: {
description: "Unauthorized"
},
403: {
description: "Forbidden"
},
404: {
description: "Not Found"
}
}
},
post: {
tags: [
"user-controller"
],
summary: "createUser",
operationId: "createUserUsingPOST",
consumes: [
"application/json"
],
produces: [
"*/*"
],
parameters: [
{
in: "body",
name: "user",
description: "user",
required: true,
schema: {
$ref: "#/definitions/User"
}
}
],
responses: {
200: {
description: "OK",
schema: {
type: "object"
}
},
201: {
description: "Created"
},
401: {
description: "Unauthorized"
},
403: {
description: "Forbidden"
},
404: {
description: "Not Found"
}
}
}
}
},
definitions: {
HelloWorlBean: {
type: "object",
properties: {
message: {
type: "string"
}
}
},
User: {
type: "object",
properties: {
dob: {
type: "string",
format: "date-time"
},
id: {
type: "integer",
format: "int64"
},
name: {
type: "string"
}
}
},
Resource«User»: {
type: "object",
properties: {
_links: {
type: "array",
items: {
$ref: "#/definitions/Link"
}
},
dob: {
type: "string",
format: "date-time"
},
id: {
type: "integer",
format: "int64"
},
name: {
type: "string"
}
}
},
ModelAndView: {
type: "object",
properties: {
empty: {
type: "boolean"
},
model: {
type: "object"
},
modelMap: {
type: "object",
additionalProperties: {
type: "object"
}
},
reference: {
type: "boolean"
},
status: {
type: "string",
enum: [
"100 CONTINUE",
"101 SWITCHING_PROTOCOLS",
"102 PROCESSING",
"103 CHECKPOINT",
"200 OK",
"201 CREATED",
"202 ACCEPTED",
"203 NON_AUTHORITATIVE_INFORMATION",
"204 NO_CONTENT",
"205 RESET_CONTENT",
"206 PARTIAL_CONTENT",
"207 MULTI_STATUS",
"208 ALREADY_REPORTED",
"226 IM_USED",
"300 MULTIPLE_CHOICES",
"301 MOVED_PERMANENTLY",
"302 FOUND",
"302 MOVED_TEMPORARILY",
"303 SEE_OTHER",
"304 NOT_MODIFIED",
"305 USE_PROXY",
"307 TEMPORARY_REDIRECT",
"308 PERMANENT_REDIRECT",
"400 BAD_REQUEST",
"401 UNAUTHORIZED",
"402 PAYMENT_REQUIRED",
"403 FORBIDDEN",
"404 NOT_FOUND",
"405 METHOD_NOT_ALLOWED",
"406 NOT_ACCEPTABLE",
"407 PROXY_AUTHENTICATION_REQUIRED",
"408 REQUEST_TIMEOUT",
"409 CONFLICT",
"410 GONE",
"411 LENGTH_REQUIRED",
"412 PRECONDITION_FAILED",
"413 PAYLOAD_TOO_LARGE",
"413 REQUEST_ENTITY_TOO_LARGE",
"414 URI_TOO_LONG",
"414 REQUEST_URI_TOO_LONG",
"415 UNSUPPORTED_MEDIA_TYPE",
"416 REQUESTED_RANGE_NOT_SATISFIABLE",
"417 EXPECTATION_FAILED",
"418 I_AM_A_TEAPOT",
"419 INSUFFICIENT_SPACE_ON_RESOURCE",
"420 METHOD_FAILURE",
"421 DESTINATION_LOCKED",
"422 UNPROCESSABLE_ENTITY",
"423 LOCKED",
"424 FAILED_DEPENDENCY",
"426 UPGRADE_REQUIRED",
"428 PRECONDITION_REQUIRED",
"429 TOO_MANY_REQUESTS",
"431 REQUEST_HEADER_FIELDS_TOO_LARGE",
"451 UNAVAILABLE_FOR_LEGAL_REASONS",
"500 INTERNAL_SERVER_ERROR",
"501 NOT_IMPLEMENTED",
"502 BAD_GATEWAY",
"503 SERVICE_UNAVAILABLE",
"504 GATEWAY_TIMEOUT",
"505 HTTP_VERSION_NOT_SUPPORTED",
"506 VARIANT_ALSO_NEGOTIATES",
"507 INSUFFICIENT_STORAGE",
"508 LOOP_DETECTED",
"509 BANDWIDTH_LIMIT_EXCEEDED",
"510 NOT_EXTENDED",
"511 NETWORK_AUTHENTICATION_REQUIRED"
]
},
view: {
$ref: "#/definitions/View"
},
viewName: {
type: "string"
}
}
},
View: {
type: "object",
properties: {
contentType: {
type: "string"
}
}
},
Link: {
type: "object",
properties: {
deprecation: {
type: "string"
},
href: {
type: "string"
},
hreflang: {
type: "string"
},
media: {
type: "string"
},
rel: {
type: "string"
},
templated: {
type: "boolean"
},
title: {
type: "string"
},
type: {
type: "string"
}
}
}
}
}

```