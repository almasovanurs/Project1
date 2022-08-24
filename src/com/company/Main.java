package com.company;

import exception.MyException;
import impl.UserService;
import impl.UserServiceImpl;
import model.Gender;
import model.User;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1,21,"Nurs", Gender.FEMALE);
        User user2 = new User(2,24, "Aidana", Gender.FEMALE);
        User user3 = new User(3,25, "Elaman", Gender.MAIL);
        User user4 = new User(4,39, "Izat", Gender.MAIL);
        try{
            UserService userService = new UserServiceImpl();
            userService.addUser(user1);
            userService.addUser(user2);
            userService.addUser(user3);
            userService.addUser(user4);
            System.out.println(" id " + userService.getById(3));
            userService.removeById(2);

            System.out.println(userService.getAll());
        }catch (MyException exception){
            System.out.println(exception.getMessage());
        }



    }
}