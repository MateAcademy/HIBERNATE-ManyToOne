package com.javarush;

import com.javarush.model.Auto;
import com.javarush.model.User;
import com.javarush.services.UserService;

/**
 * @author Sergey Klunniy
 * CRUD-приложение (Create,Read,Update,Delete),
 */
public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();
        User user = new User("Masha",26);
        userService.saveUser(user);
        Auto ferrari = new Auto("Ferrari", "red");
        ferrari.setUser(user);
        user.addAuto(ferrari);
        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        user.addAuto(ford);
        userService.updateUser(user);


//        UserService userService = new UserService();
//        User user = new User("Masha",26);
//        userService.saveUser(user);
//        Auto ferrari = new Auto("Ferrari", "red");
//        user.addAuto(ferrari);
//        Auto ford = new Auto("Ford", "black");
//        ford.setUser(user);
//        user.addAuto(ford);
//        userService.updateUser(user);
//        user.setName("Sasha");
//        userService.updateUser(user);


//        UserService userService = new UserService();
//        User user = new User("Masha",26);
//        userService.saveUser(user);
//        Auto ferrari = new Auto("Ferrari", "red");
//        user.addAuto(ferrari);
//        Auto ford = new Auto("Ford", "black");
//        ford.setUser(user);
//        user.addAuto(ford);
//        userService.updateUser(user);
//        user.setName("Sasha");
//        userService.updateUser(user);
//        userService.deleteUser(user);
    }
}