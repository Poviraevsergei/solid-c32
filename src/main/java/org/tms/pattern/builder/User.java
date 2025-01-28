package org.tms.pattern.builder;

import lombok.Builder;

@Builder
public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;
    private String country;
    private String username;
    private String password;
    private String sex;

//Constructor, getters, setters etc.
    
    /*public static class UserBuilder {
        User user;

        public UserBuilder() {
            user = new User();
        }

        public UserBuilder setFirstName(String firstName) {
            user.firstName = firstName;
            return this;
        }
        
        public UserBuilder setLastName(String lastName) {
            user.lastName = lastName;
            return this;
        }
        
        public UserBuilder setAge(int age) {
            user.age = age;
            return this;
        }
        
        public UserBuilder setEmail(String email) {
            user.email = email;
            return this;
        }
        
        public UserBuilder setPhoneNumber(String phoneNumber) {
            user.phoneNumber = phoneNumber;
            return this;
        }
        
        public UserBuilder setAddress(String address) {
            user.address = address;
            return this;
        }
        
        public UserBuilder setCity(String city) {
            user.city = city;
            return this;
        }
        
        public UserBuilder setCountry(String country) {
            user.country = country;
            return this;
        }
        
        public UserBuilder setUsername(String username) {
            user.username = username;
            return this;
        }
        
        public UserBuilder setPassword(String password) {
            user.password = password;
            return this;
        }
        
        public UserBuilder setSex(String sex){
            user.sex = sex;
            return this;
        }

        public User build() {
            return user;
        }
    }*/

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
