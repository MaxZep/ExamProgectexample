package org.top.examprogectexample.model.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable=false)
    private boolean availability;
    @Column(nullable = false, length = 200)
    private String itemName;
    @Column(nullable = false)
    private Integer cost;
    @OneToMany(mappedBy = "item")
    private Set<OrderItem> orderItem;


    public Item() {
        this.id = -1;
        this.itemName = "undefined";
        this.cost = -1;
        this.availability = false;

    }

    public Item(Integer id, boolean availability, String itemName, Integer cost) {
        this.id = id;
        this.availability = availability;
        this.itemName = itemName;
        this.cost = cost;
    }
    public Item(boolean availability, String itemName, Integer cost) {
        this.availability = availability;
        this.itemName = itemName;
        this.cost = cost;
    }

    public Item(Integer id, boolean availability, String itemName, Integer cost, Set<OrderItem> orderItem) {
        this.id = id;
        this.availability = availability;
        this.itemName = itemName;
        this.cost = cost;
        this.orderItem = orderItem;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Set<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(Set<OrderItem> orderItem) {
        this.orderItem = orderItem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = true;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}