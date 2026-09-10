package org.skypro.skyshop.product;

public class SimpleProduct extends Product {
    private final int price;

    public SimpleProduct(String name,int price){
        this.price = price;

        super(name);
    }

    @Override
    protected int getPrice() { return price; }

    @Override
    public boolean isSpecial() { return false; }

    @Override
    public String toString() { return Name + ": " + Price; }
}
