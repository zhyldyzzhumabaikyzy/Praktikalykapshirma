package com.company;

public class Main {

    public static void main(String[] args) {

        User user1 = new User();
        user1.setId(1);
        User user2 = new User();
        user2.setId(2);
        User user3 = new User();
        user3.setId(3);

        System.out.println(user3.getId());
        System.out.println(user2.getId());
        System.out.println(user1.getId());

    }
}
