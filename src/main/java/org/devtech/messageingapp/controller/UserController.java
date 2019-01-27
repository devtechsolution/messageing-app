package org.devtech.messageingapp.controller;

import org.devtech.messageingapp.dao.UserDao;
import org.devtech.messageingapp.exception.UserNotFoundException;
import org.devtech.messageingapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDao userDaoImpl;

    //GET /users
    //retriveAllUsers
    @GetMapping("/users")

    public List<User> getAllUsers() {

        return userDaoImpl.findAll();
    }


    //GET /user/{id}
    //retriveUser(Long id)
    @GetMapping("/user/{id}")
    public Resource<User> getUserById(@PathVariable Long id) {

        User user = userDaoImpl.findById(id);
        if (user == null) {
            throw new UserNotFoundException("id-" + id);
        }

        //all-users , SERVER_PATH(ContextRoot)+ "/users"
        //getAllUsers
        Resource<User> resource = new Resource<>(user);
        ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass())
                .getAllUsers());
        resource.add(linkTo.withRel("all-users"));

        return resource;
    }

    /*
     * @inut - details of user
     * @Outpt- Created & Return the created URI
     * */

    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {

        User saveUser = userDaoImpl.save(user);
        //Created
        // /user/{id}
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(saveUser.getId())
                .toUri();


        return ResponseEntity.created(location).build();


    }


    //Delete /user/{id}
    //retriveUser(Long id)
    @DeleteMapping("/user/{id}")
    public void deleteUserById(@PathVariable Long id) {

        User user = userDaoImpl.deleteById(id);
        if (user == null) {
            throw new UserNotFoundException("id-" + id);
        }
        //return user;
    }
}
