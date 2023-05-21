package com.example.demo.controller;
import com.example.demo.VO.VoTemplate;
import com.example.demo.dto.Order;
import com.example.demo.service.orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderdetails")
public class OrderController {
    @Autowired
    VoTemplate voTemplate;
    @Autowired
    orderService orderService;
    @PostMapping("/single")
    public Order saveuser(@RequestBody Order order)
    {
        return orderService.saveuser(order);

    }
    @PostMapping("/multiple")
    public List<Order> savemuliusers(@RequestBody List<Order> userDetails)
    {
        return orderService.savemultiusers(userDetails);
    }
    @GetMapping()
    public List<Order> getusers()
    {
        return orderService.getusersList();
    }

    @GetMapping("/{orderId}")
    public VoTemplate getorderproduct(@PathVariable Integer orderId){
        return orderService.getorderproduct(orderId);
    }
    @DeleteMapping("/delete/{orderId}")
    public void deleteOrder(@PathVariable("orderId") int orderId)
    {
        orderService.deleteOrder(orderId);
    }


}
