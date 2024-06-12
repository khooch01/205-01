package com.khooch.onestopgroceries.service;

import com.khooch.onestopgroceries.dao.StoreDAO;
import com.khooch.onestopgroceries.entity.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    @Autowired
    private StoreDAO storeDAO;

    public void addStore(Store store) {
        storeDAO.addStore(store);
    }

    public List<Store> getAllStores() {
        return storeDAO.getAllStores();
    }
}
