package org.top.examprogectexample.model.dao.order;

import org.top.examprogectexample.model.entity.Item;
import org.top.examprogectexample.model.entity.Order;

import java.util.List;
import java.util.Optional;


public interface IDaoOrder {
    Order addOrder(Order order);//формировать заказы на товары
    List<Order> findAll();//получать список всех заказов
    Optional<Order> findById(Integer Id);//получать заказ по id
    void delete(Item id);//удалять заказ по id
}
