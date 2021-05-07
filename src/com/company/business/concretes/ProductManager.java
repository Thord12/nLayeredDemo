package com.company.business.concretes;

import com.company.business.abstracts.ProductService;
import com.company.core.abstracts.LoggerService;
import com.company.dataAccess.abstracts.ProductDao;
import com.company.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {
    private ProductDao dao;
    private LoggerService loggerService;

    public ProductManager(ProductDao dao, LoggerService loggerService) {
        super();
        this.dao = dao;
        this.loggerService= loggerService;
    }

    @Override
    public void add(Product product) {
        if (product.getCategoryId()==1){
            System.out.println("Bu kategoride ürün kabul edilmiyor :(");
            return;
        }
        this.dao.add(product);
        this.loggerService.log2System("Ürün eklendi "+product.getName());
    }


    @Override
    public List<Product> getAll() {
        return null;
    }
}
