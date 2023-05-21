package com.example.demo.VO;
import com.example.demo.dto.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class VoTemplate {
   private Order order;
   private Product product;
}
