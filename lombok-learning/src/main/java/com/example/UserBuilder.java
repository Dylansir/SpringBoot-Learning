package com.example;

import lombok.Builder;

@Builder
public class UserBuilder {
    private Long userId;
    private String username;
    private String password;
}
