package com.result.oop.srp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wang on 2017/6/24.
 */
public class UserService {

    public List<User> getUsers(Product product){
        //从DAO获取订阅产品的用户列表
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            User u = new User();
            u.setName("user" + i);
            u.setEmail("user" + i +"@163.com");
            users.add(u);
        }

        return users;
    }
}
