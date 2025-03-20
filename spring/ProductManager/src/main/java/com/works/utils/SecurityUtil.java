package com.works.utils;

import java.util.UUID;

public class SecurityUtil {

    public String userRandomID() {
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }

    public void call1() {
        String name = "data1";
        System.out.println("Call1 Call" + name);
    }

    public void call2() {
        System.out.println("Call2 Call");
    }

}
