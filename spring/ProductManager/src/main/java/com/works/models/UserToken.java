package com.works.models;

@lombok.Data
public class UserToken {
    private long id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String gender;
    private String image;
    private String accessToken;
    private String refreshToken;
}
