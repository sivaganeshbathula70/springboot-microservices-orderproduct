package com.example.notiiservice.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product_details")
public class Product {
    @Id
    @GeneratedValue
    private int productId;
    private String product_name;
    private String product_status;
    private String product_location;
}
