package core.basesyntax.impl;

import core.basesyntax.Storage;

public class StorageImpl<K, V> implements Storage<K, V> {
    private final int CAPACITY = 10;
    private K[] keys;
    private V[] values;
    private int size;

    public StorageImpl() {
        size = 0;
        keys = (K[]) new Object[CAPACITY];
        values = (V[]) new Object[CAPACITY];
    }

    @Override
    public void put(K key, V value) {
        for (int i = 0; i < size; i++) {
            if (key == keys[i] || (key != null && key.equals(keys[i]))) {
                values[i] = value;
                return;
            }

        }
        keys[size] = key;
        values[size] = value;
        size++;
    }

    @Override
    public V get(K key) {
        for (int i = 0; i < size; i++) {
            if (key == keys[i] || (key != null && key.equals(keys[i]))) {
                return values[i];
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }
}
