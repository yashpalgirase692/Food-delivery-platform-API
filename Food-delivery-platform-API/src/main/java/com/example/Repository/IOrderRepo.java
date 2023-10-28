package com.example.Repository;

import com.example.Model.Order;
import com.example.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrderRepo extends JpaRepository<Order, Integer> {
    public List<Order> findByUser(User user);
}
