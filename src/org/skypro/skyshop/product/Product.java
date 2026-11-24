package org.skypro.skyshop.product;

import org.skypro.skyshop.Interface.Searchable;

public abstract class Product implements Searchable {
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

    public String searchTerm(){ return Name; }

    public String getContent(){ return "PRODUCT"; }
}
