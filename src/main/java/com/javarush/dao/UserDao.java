package com.javarush.dao;

import com.javarush.model.Auto;
import com.javarush.model.User;

import java.util.List;

/**
 * @author Sergey Klunniy
 */
public interface UserDao {
    User findById(int id);
    void save(User user);
    void update(User user);
    void delete(User user);

    Auto findAutoById(int id);

    List<User> findAll();
}
