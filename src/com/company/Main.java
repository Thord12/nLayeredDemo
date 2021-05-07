package com.company;

import com.company.business.abstracts.ProductService;
import com.company.business.concretes.ProductManager;
import com.company.core.concretes.JLoggerManagerAdapter;
import com.company.dataAccess.concretes.HibernateProduct;
import com.company.entities.concretes.Product;
import com.company.jLogger.concretes.JloggerManager;

public class Main {

    public static void main(String[] args) {
        Product product1=new Product(1,1,"Elma",4.7,100);
        ProductService productService=new ProductManager(new HibernateProduct(),new JLoggerManagerAdapter());
        productService.add(product1);

    }
}
