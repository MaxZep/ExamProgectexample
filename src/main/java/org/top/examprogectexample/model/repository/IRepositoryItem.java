package org.top.examprogectexample.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.top.examprogectexample.model.entity.Item;

import java.util.Optional;

public interface IRepositoryItem extends CrudRepository <Item,Integer>{

}
