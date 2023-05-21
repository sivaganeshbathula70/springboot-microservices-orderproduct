package com.example.notiiservice.service;
import com.example.notiiservice.dto.Product;
import com.example.notiiservice.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    public Product savedeparment(Product product){
        return productRepo.save(product);
    }

    public List<Product> savedepartments(List<Product> product){
        return  productRepo.saveAll(product);

    }

    public List<Product> getdepartment() {
        return  productRepo.findAll();
    }


   /* public Product findByDeptId(Integer productId) {
     //  return productRepo.findByDeptId(productId);
   // }

    */

    public Product findByProductId(Integer productId){
        return productRepo.findByProductId(productId);
    }
}
