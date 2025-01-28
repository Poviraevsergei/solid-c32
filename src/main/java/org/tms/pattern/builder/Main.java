package org.tms.pattern.builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .age(13)
                .country("BLR")
                .email("tms@gmail.com")
                .build();

        System.out.println(user);

        User user1 = new User.UserBuilder().username("root").password("root").build();
        System.out.println(user1);
    }
}
