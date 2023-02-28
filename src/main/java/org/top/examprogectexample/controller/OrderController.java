package org.top.examprogectexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.top.examprogectexample.model.dao.order.IDaoOrder;
import org.top.examprogectexample.model.entity.Item;
import org.top.examprogectexample.model.entity.Order;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    private IDaoOrder DaoOrder;

    @GetMapping("/ping")
    public String ping() {
        return "order pong";
    }
    @PostMapping("/add")
    public Order addOrder( @RequestParam String clientName,
                           @RequestParam Integer date) {
        Order order=new Order(clientName,date);
        order.setClientName(clientName);
        order.setDate(date);
        return DaoOrder.addOrder(order);
    }
    @GetMapping("/all")
    public List<Order> all() {
        return DaoOrder.findAll();
    }
    @GetMapping("/findById")
    public Optional<Order> findById(@RequestParam Integer id) {
        return DaoOrder.findById(id);
    }
}
