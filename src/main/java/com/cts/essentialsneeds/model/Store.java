package com.cts.essentialsneeds.model;

import java.util.List;

public class Store {

    private String storeName;
    private List<Item> items;

    public Store(String storeName, List<Item> items) {
        this.storeName = storeName;
        this.items = items;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
