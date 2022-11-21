package com.example.shopspring.repository;

import com.example.shopspring.model.Item;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.LinkedList;
import java.util.List;

@Repository
@SessionScope
public class Basket {
    private final List<Item> basket = new LinkedList<>();

    public List<Item> getBasket() {
        return basket;
    }

    public void addItem(Item item) {
        this.basket.add(item);
    }
}
