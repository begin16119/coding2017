package com.result.oop.srp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wang on 2017/6/24.
 */
public class User {

    private String name;

    private String emailAddress;

    private List<Product> subscribedProducts = new ArrayList<>();

    public String getName(){
        return name;
    }
    public String getEMailAddress() {
        return emailAddress;
    }
    public List<Product> getSubscribedProducts(){
        return this.subscribedProducts;
    }

    public void setEmail(String eMail) {
        this.emailAddress = eMail;
    }

    public void setName(String name) {
        this.name = name;
    }
}
