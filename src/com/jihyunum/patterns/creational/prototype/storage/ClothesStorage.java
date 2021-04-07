package com.jihyunum.patterns.creational.prototype.storage;

import com.jihyunum.patterns.creational.prototype.clothes.Clothes;

import java.util.HashMap;
import java.util.Map;

public class ClothesStorage {
    private Map<String, Clothes> storage;

    public ClothesStorage() {
        storage = new HashMap<>();
    }

    public Clothes put(String key, Clothes clothes) {
        storage.put(key, clothes);
        return clothes;
    }

    public Clothes get(String key) {
        return storage.get(key).clone();
    }
}
