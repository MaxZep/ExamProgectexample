package org.top.examprogectexample.model.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name= "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column (nullable = false, length = 200)
    String clientName;

   @Column (nullable = true)
   Integer date;
    //один заказ - много товаров
    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<OrderItem> orderItem;

    public Order(Integer id, String clientName, Integer date) {
        this.id = id;
        this.clientName = clientName;
        this.date = date;
    }

    public Order(String clientName, Integer date) {
        this.clientName = clientName;
        this.date = date;
    }

    public Order() {
        this.clientName = "noname";
        this.date =-1;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public Set<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(Set<OrderItem> orderItem) {
        this.orderItem = orderItem;
    }
}
