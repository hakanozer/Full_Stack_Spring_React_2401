package com.works.models;

@lombok.Data
public class Comment {
    private long id;
    private String body;
    private long postID;
    private long likes;
    private User user;
}
