package com.jihyunum.patterns.creational.prototype.clothes;

import java.util.Objects;

public class Shirt extends Clothes {
    public String pattern;

    public Shirt() {}

    public Shirt(Shirt shirt) {
        super(shirt);
        if (shirt != null) {
            this.pattern = shirt.pattern;
        }
    }

    @Override
    public Clothes clone() {
        return new Shirt(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Shirt) || !super.equals(obj)) {
            return false;
        }
        Shirt shirt = (Shirt) obj;
        return Objects.equals(shirt.pattern, this.pattern);
    }
}
