package org.devtech.messageingapp.dao;

import org.devtech.messageingapp.model.User;

import java.util.List;

public interface UserDao {

    public List<User> findAll();
    public User save(User user);
    public User findById(Long id);
    public User deleteById(Long id);

}
