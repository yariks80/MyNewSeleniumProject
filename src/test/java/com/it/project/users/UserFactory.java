package com.it.project.users;

import com.it.project.utils.Utils;

import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserFactory {
    private static ResourceBundle user= ResourceBundle.getBundle("user");

    public static User getValidUser() {
        return  new User(
                user.getString("userName"),
                user.getString("password"),
                user.getString("email")
        );
    }

    public static ArrayList<User> getRandomUsers(int count) {
        return (ArrayList<User>) Stream.generate(()->
                new User(Utils.getRandomString(10),
                        Utils.getRandomString(15),
                        Utils.getRandomString(10)+"@gmail.com"))
                .limit(count).collect(Collectors.toList());
    }
}
