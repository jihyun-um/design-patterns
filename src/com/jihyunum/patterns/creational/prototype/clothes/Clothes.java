package com.jihyunum.patterns.creational.prototype.clothes;

import java.util.Objects;

public abstract class Clothes {
    public int size;
    public String color;

    public Clothes() {}

    public Clothes(Clothes clothes) {
        if (clothes != null) {
            this.size = clothes.size;
            this.color = clothes.color;
        }
    }

    public abstract Clothes clone();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Clothes)) {
            return false;
        }
        Clothes clothes = (Clothes) obj;
        return clothes.size == this.size && Objects.equals(clothes.color, this.color);
    }
}
