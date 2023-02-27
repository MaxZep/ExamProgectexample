package org.top.examprogectexample.model.dao.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.top.examprogectexample.model.entity.Item;
import org.top.examprogectexample.model.entity.Order;
import org.top.examprogectexample.model.repository.IRepositoryOrder;

import java.util.List;
import java.util.Optional;


@Service
    public class DbDaoOrders implements IDaoOrder {
        @Autowired
        private IRepositoryOrder repository;

    @Override
    public Order addOrder(Order order) {
        return  repository.save(order);
    }

    @Override
    public List<Order> findAll() {
        return (List<Order>) repository.findAll();
    }

    @Override
    public Optional<Order> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void delete(Item id) {

    }
}
