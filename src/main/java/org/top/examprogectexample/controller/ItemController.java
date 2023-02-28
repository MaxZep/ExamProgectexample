package org.top.examprogectexample.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import org.top.examprogectexample.model.dao.item.IDaoItem;
import org.top.examprogectexample.model.entity.Item;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("item")
public class ItemController {
    @Autowired
    private IDaoItem DaoItem;

    @GetMapping("/ping")
    public String ping() {
        return "item pong";
    }

    @GetMapping("/all")
    public List<Item> all() {
        return DaoItem.findAll();
    }

    @GetMapping("/findById")
    public Optional<Item> findById(@RequestParam Integer id) {
        return DaoItem.findById(id);
    }

    @GetMapping("/findByName")
    public List<Item> findByName(@RequestParam String name) {
        return DaoItem.findAll();
    }

    @PostMapping("/add")
    public Item save(@RequestParam boolean availability,
                     @RequestParam String itemName,
                     @RequestParam Integer cost)
                      {

        Item item = new Item(availability,itemName,cost);
        item.setAvailability(availability);
        item.setItemName(itemName);
        item.setCost(cost);
        return DaoItem.save(item);
    }

    @PostMapping("/updateItem")
    public Item updateItem(@RequestParam boolean availability,
                           @RequestParam String itemName,
                           @RequestParam Integer cost) {
        Item item = new Item(availability,itemName,cost);
        return DaoItem.update(item);
    }

}
