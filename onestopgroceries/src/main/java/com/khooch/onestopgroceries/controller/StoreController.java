package com.khooch.onestopgroceries.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.khooch.onestopgroceries.entity.Store;
import com.khooch.onestopgroceries.service.StoreService;

import java.util.List;

@RestController
@RequestMapping("/stores")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @PostMapping
    public List<Store> addStore(@RequestBody Store store) {
        storeService.addStore(store);
        return storeService.getAllStores();
    }

    @GetMapping
    public List<Store> getAllStores() {
        return storeService.getAllStores();
    }
}
