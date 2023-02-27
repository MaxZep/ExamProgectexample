package org.top.examprogectexample.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.top.examprogectexample.model.entity.Order;

public interface IRepositoryOrder extends CrudRepository<Order,Integer> {
}
