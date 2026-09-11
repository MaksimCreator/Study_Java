package org.skypro.skyshop.product;

public abstract class Product {
    public final String Name;
    public final int Price;

    public Product(String name){
        Name = name;
        Price = getPrice();
    }

    protected abstract int getPrice();

    public abstract boolean isSpecial();

    @Override
    public abstract String toString();
}
