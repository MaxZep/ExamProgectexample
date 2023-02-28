package org.top.examprogectexample.model.dao.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.top.examprogectexample.model.entity.Item;
import org.top.examprogectexample.model.repository.IRepositoryItem;

import java.util.List;
import java.util.Optional;

@Service
public class DbDaoItem implements IDaoItem{
    @Autowired
    private IRepositoryItem repository;
    @Override
    public List<Item> findAll(){
        return (List<Item>) repository.findAll();
    }

    @Override
    public Optional<Item> findById(Integer id) {

        return repository.findById(id);
    }

    @Override
    public List<Item> findByName(String name) {
        Item item = new Item();
        if(item.getItemName().equals(name)){

        return (List<Item>) repository.findAll();

    }
        else return null ;}


    @Override
    public Item save(Item item) {
        return repository.save(item);
    }
    @Override
    public Item delete(Item id) {
        return null;

    }

    @Override
    public Item update(Item item) {

        if (repository.findById(item.getId()).isPresent()) {
            return repository.save(item);
        }
        else return null;
    }
}
