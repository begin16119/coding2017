package com.result.oop.srp;

import java.io.*;

/**
 * Created by wang on 2017/6/24.
 */
public class ProductService {

    public Product getPromotionProduct(File file){
        BufferedReader br = null;
        Product product = new Product();
        try {
            br = new BufferedReader(new FileReader(file));

            String newLine = br.readLine();
            String[] datas = newLine.split(" ");

            product.setId(datas[0]);
            product.setDesc(datas[1]);
            return product;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }


}
