package com.example.shopspring.service;

import com.example.shopspring.model.Item;
import com.example.shopspring.repository.Basket;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class ItemService {

    private final Basket basket;

    public ItemService(Basket basket) {
        this.basket = basket;
    }

    public List<Item> getBasket() {
        return basket.getBasket();
    }

    public List<Item> addItem(List<Integer> id) {
        List<Item> list = new LinkedList<>();
        for (Integer integer : id) {
            Item item = new Item(integer);
            this.basket.addItem(item);
            list.add(item);
        }
        return list;
    }
}
