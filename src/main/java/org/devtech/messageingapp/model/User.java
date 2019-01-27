package org.devtech.messageingapp.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@ApiModel(description = "All details about the USER")
public class User {

    private Long id;

    @Size(min =2, message = "Name should have at least two character")
    @ApiModelProperty(notes ="Name should have at least 2 character")
    private String name;
    @Past
    @ApiModelProperty(notes ="Birth Date should be in past")
    private Date dob;

    private User(){

    }
    public User(Long id, String name, Date dob) {
        super();
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }
}
