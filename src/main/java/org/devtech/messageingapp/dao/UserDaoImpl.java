package org.devtech.messageingapp.dao;

import org.devtech.messageingapp.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private static List<User> users= new ArrayList<>();
    private static Long userCount =3L;

    static {
        users.add(new User(1L,"Ram ",new Date()));
        users.add(new User(2L,"Shyam ",new Date()));
        users.add(new User(3L,"Shiva ",new Date()));
    }

    public List<User> findAll(){
        return  users;
    }
    public User save(User user){
        if (user.getId()==null){
            user.setId(++userCount);
        }
        users.add(user);
        return  user;
    }
    public User findById(Long id){
        for (User user: users){
            if (user.getId()==id){
                return  user;
            }
        }
        return  null;
    }

    @Override
    public User deleteById(Long id) {

        Iterator<User> iterator= users.iterator();
        while (iterator.hasNext()){
            User user= iterator.next();
            if (user.getId()==id){
                iterator.remove();
                return  user;
            }
        }
        return null;
    }

}
