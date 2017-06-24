package com.result.oop.srp;

import java.util.List;

/**
 * Created by wang on 2017/6/24.
 */
public class Mail {

    private User user;
    public Mail(User u){
        this.user = u;
    }

    public String getAddress(){ return user.getEMailAddress();}
    public String getSubject(){ return "您关注的产品降价了";}

    public String getBody(){
        return "尊敬的 " + user.getName() +", 您关注的产品 " + this.buildProductDescList() +"降价了，欢迎购买！";
    }

    private String buildProductDescList() {
        List<Product> products = user.getSubscribedProducts();
        StringBuilder sb = new StringBuilder();

        for (Product p : products) {
            sb.append(p.getDesc()+"、");
        }
        return sb.toString();
    }


}
