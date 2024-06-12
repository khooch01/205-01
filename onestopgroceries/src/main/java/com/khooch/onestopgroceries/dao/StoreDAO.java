package com.khooch.onestopgroceries.dao;

import java.util.ArrayList;
import java.util.List;

import com.khooch.onestopgroceries.entity.Store;
import org.springframework.stereotype.Repository;



@Repository
public class StoreDAO {
    private List<Store> stores = new ArrayList<>();

    public void addStore(Store store) {
        stores.add(store);
    }

    public List<Store> getAllStores() {
        return stores;
    }
}
