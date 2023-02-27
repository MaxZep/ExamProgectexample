package org.top.examprogectexample.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "orderItem")


    public class OrderItem {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer id;

        @Column
        Integer amount;
    //много заказов - один товар
        @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
        @JsonIgnore
        @JoinColumn(name = "item_id", nullable = false)
        private Item item;
    // много товаров - один заказ
        @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
        @JsonIgnore
        @JoinColumn(name = "order_id", nullable = false)
        private Order order;
    }


