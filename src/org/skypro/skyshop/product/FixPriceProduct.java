package org.skypro.skyshop.product;

public class FixPriceProduct extends Product{
    private static final int FIX_PRICE = 250;

    public FixPriceProduct(String name){
        super(name);
    }

    @Override
    protected int getPrice() { return FIX_PRICE; }

    @Override
    public boolean isSpecial() { return true; }

    @Override
    public String toString() { return Name + ": " + "Фиксированная цена " + FIX_PRICE; }
}
