package com.jihyunum.patterns.creational.prototype.clothes;

import java.util.Objects;

public class Jeans extends Clothes {
    public String length;

    public Jeans() {}

    public Jeans(Jeans Jeans) {
        super(Jeans);
        if (Jeans != null) {
            this.length = Jeans.length;
        }
    }

    @Override
    public Clothes clone() {
        return new Jeans(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Jeans) || !super.equals(obj)) {
            return false;
        }
        Jeans Jeans = (Jeans) obj;
        return Objects.equals(Jeans.length, this.length);
    }
}
