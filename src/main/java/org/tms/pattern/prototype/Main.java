package org.tms.pattern.prototype;

public class Main {
    public static void main(String[] args) {
        User originalUser = new User("John","Winchester",33);
        
        User clonedUser = (User)originalUser.clone();
        clonedUser.setAge(50);

        System.out.println(originalUser);
        System.out.println(clonedUser);
    }
}
