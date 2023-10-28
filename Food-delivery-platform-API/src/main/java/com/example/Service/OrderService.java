package com.example.Service;

import com.example.Model.Order;
import com.example.Model.User;
import com.example.Repository.IOrderRepo;
import com.example.Repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    IOrderRepo orderRepo;

    @Autowired
    IUserRepo userRepo;

    public String orderFoodItem(Order order) {
        order.setOrderDateTime(LocalDateTime.now());
        order.setStatus("Your order is placed successfully..");
        orderRepo.save(order);
        return "Order successfully placed";
    }


    public Optional<Order> getOrderById(Integer orderId) {
        return orderRepo.findById(orderId);
    }

    public List<Order> getListOfOrders() {
        return orderRepo.findAll();
    }

    public String cancelOrder(Integer id) {
        orderRepo.deleteById(id);
        return "Order cancel successfully...";
    }

    public List<Order> getListOfOrdersOfUser(String email) {
        User user = userRepo.findFirstByEmail(email);
        return orderRepo.findByUser(user);
    }
}
