package org.top.examprogectexample.model.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name= "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String clientName;

   @Column
    Date date;
    //один заказ - много товаров
    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<OrderItem> orderItem;

    public Order(Integer id, String clientName, Date date) {
        this.id = id;
        this.clientName = clientName;
        this.date = date;
    }

    public Order() {

    }
}
