package org.devtech.messageingapp.model;

public class HelloWorlBean {


    private  String message;

    public HelloWorlBean(String message) {
        this.message= message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorlBean{" +
                "message='" + message + '\'' +
                '}';
    }
}