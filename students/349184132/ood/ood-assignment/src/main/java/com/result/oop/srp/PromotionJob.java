package com.result.oop.srp;

import java.io.File;
import java.util.List;

/**
 * Created by wang on 2017/6/24.
 */
public class PromotionJob {

    private ProductService productService = new ProductService();
    private UserService userService = new UserService();

    public void run(){
        File f = new File("src/main/java/com/result/oop/srp/product_promotion.txt");
        Product p = productService.getPromotionProduct(f);

        List<User> users = userService.getUsers(p);

        MailSender mailSender = new MailSender(new Configuration());

        for (User user : users){
            mailSender.sendMail(new Mail(user));
        }

    }

    public static void main(String[] args) {
        PromotionJob job = new PromotionJob();
        job.run();
    }
}
