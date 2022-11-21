package com.example.shopspring.controller;

import com.example.shopspring.model.Item;
import com.example.shopspring.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StoreController {
    private final ItemService itemService;

    public StoreController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/order/add")
    public List<Item> addItem(@RequestParam("id") List<Integer> id){
        return this.itemService.addItem(id);
    }

    @GetMapping ("/order/get")
    public List<Item> getBasket() {
        return this.itemService.getBasket();
    }
}
