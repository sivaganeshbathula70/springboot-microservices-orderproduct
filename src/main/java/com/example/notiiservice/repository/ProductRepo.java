package com.example.notiiservice.repository;
import com.example.notiiservice.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    Product findByProductId(Integer productId);

    //Product findByDeptId(Integer productId);
}
