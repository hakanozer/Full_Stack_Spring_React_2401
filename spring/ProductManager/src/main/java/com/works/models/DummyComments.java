package com.works.models;

import java.util.List;

@lombok.Data
public class DummyComments {
    private List<Comment> comments;
    private long total;
    private long skip;
    private long limit;
}
