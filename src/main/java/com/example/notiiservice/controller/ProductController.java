package com.example.notiiservice.controller;
import com.example.notiiservice.dto.Product;
import com.example.notiiservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("/single")
    public Product saveDepartment(@RequestBody Product product){
      return  productService.savedeparment(product);



    }
    @PostMapping("/multiple")
    public List<Product> saveDepartments(@RequestBody List<Product> product){
        return productService.savedepartments(product);
    }
    @GetMapping()
    public List<Product> getdepartmentList()
    {
        return productService.getdepartment();
    }
  /*
   @GetMapping("/{productId}")
    public Product getByDeptId(@PathVariable Integer productId){
       return productService.findByDeptId(productId);
   }

   */
    @GetMapping("/{productId}")
    public Product getByProductId(@PathVariable Integer productId){
        return productService.findByProductId(productId);
    }
}
