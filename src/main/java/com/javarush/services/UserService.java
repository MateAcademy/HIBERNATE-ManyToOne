package com.javarush.services;

import com.javarush.dao.impl.UserDaoImpl;
import com.javarush.model.Auto;
import com.javarush.model.User;

import java.util.List;

public class UserService {

    private UserDaoImpl usersDao = new UserDaoImpl();

    public UserService() {
    }

    public User findUser(int id) {
        return usersDao.findById(id);
    }

    public void saveUser(User user) {
        usersDao.save(user);
    }

    public void deleteUser(User user) {
        usersDao.delete(user);
    }

    public void updateUser(User user) {
        usersDao.update(user);
    }

    public List<User> findAllUsers() {
        return usersDao.findAll();
    }

    public Auto findAutoById(int id) {
        return usersDao.findAutoById(id);
    }


}