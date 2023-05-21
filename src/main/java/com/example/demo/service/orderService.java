package com.example.demo.service;

import com.example.demo.VO.Product;
import com.example.demo.VO.VoTemplate;
import com.example.demo.dto.Order;
import com.example.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class orderService {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    OrderRepository orderRepository;
    public Order saveuser(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> savemultiusers(List<Order> userDetails) {
        return orderRepository.saveAll(userDetails);
    }

    public List<Order> getusersList() {
        return orderRepository.findAll();
    }

    public VoTemplate getorderproduct(Integer orderId){
        VoTemplate vo = new VoTemplate();
        Order order = orderRepository.getByOrderId(orderId);
        Product product = restTemplate.getForObject("http://localhost:1133/product/"+order.getProductId(),Product.class);
        vo.setOrder(order);
        vo.setProduct(product);
        return vo;
    }

    public void deleteOrder(int orderId){
        orderRepository.getByOrderId(orderId);
    }
}
