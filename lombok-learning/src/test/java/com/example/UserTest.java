package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UserTest {
    @Test
    public void testData() {
        User user=new User();
        user.setUserId(100L);
        user.setUsername("dylan");
        user.setPassword("dylan");
        System.out.println("toString="+user.toString());
        User user1=new User();
        user1.setUserId(100L);
        user1.setUsername("dylan");
        user1.setPassword("dylan");
        System.out.println("equals="+user.equals(user1));
        System.out.println("hashCode="+user.hashCode());
        System.out.println("canEqual="+user.canEqual(user1));
    }
    @Test
    public void testFieldNameConstants(){
        UserFieldNameConstants userSet=new UserFieldNameConstants();

    }
    @Test
    public void testUserAllArgsConstructor(){
        UserAllArgsConstructor userSet=new UserAllArgsConstructor(100L,"dylan","dylan");

    }
    @Test
    public void testBuilder(){
        UserBuilder builder=UserBuilder.builder().password("dylan").username("dylan").userId(100L).build();
    }

}
