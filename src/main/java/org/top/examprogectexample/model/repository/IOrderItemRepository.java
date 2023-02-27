package org.top.examprogectexample.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.top.examprogectexample.model.entity.OrderItem;

public interface IOrderItemRepository extends CrudRepository<OrderItem,Integer> {
}
