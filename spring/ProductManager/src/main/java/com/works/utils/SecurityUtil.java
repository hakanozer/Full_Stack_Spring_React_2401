package com.works.utils;

import com.works.entities.Customer;

import java.util.UUID;

public class SecurityUtil {

    public static Customer customerSession = null;

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
