package com.company.dataAccess.concretes;

import com.company.dataAccess.abstracts.ProductDao;
import com.company.entities.concretes.Product;

import java.util.ArrayList;

public class HibernateProduct implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println("Added with HiberNate"+product.getName());
    }

    @Override
    public void update(Product product) {
        System.out.println("Updated with HiberNate"+product.getName());
    }

    @Override
    public void delete(Product product) {
        System.out.println("Deleted with HiberNate"+product.getName());
    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public ArrayList<Product> getAll() {
        return null;
    }
    //veriye erişim kodları

}
