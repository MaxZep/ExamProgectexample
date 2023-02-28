package org.top.examprogectexample.model.dao.item;

import org.top.examprogectexample.model.entity.Item;

import java.util.List;
import java.util.Optional;
//добавлять/удалять/редактировать/получать список товаров
//получать товар по id
//получать товар по названию

public interface IDaoItem {
    Item save(Item item);//добавление товара
    Item delete(Item id);//удалить
    Item update(Item item);//обновить
    List<Item> findAll();//получение списка товаров
    Optional<Item> findById(Integer Id);//получить товар по id
    Object findByName(String name);//поиск по названию



}
