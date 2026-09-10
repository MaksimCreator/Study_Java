package org.skypro.skyshop.product;

public class DiscountedProduct extends Product{
    private final float price;
    private final float sale;

    public DiscountedProduct(String name,int price,int sale){
        if(sale < 0 || sale > 100)
            throw new IllegalStateException();

        this.price = price;
        this.sale = sale;

        super(name);
    }

    @Override
    protected int getPrice() { return (int)(price - price / 100 * sale); }

    @Override
    public boolean isSpecial() { return true; }

    @Override
    public String toString() { return Name + ": " + Price + " (" + sale + "%)"; }
}
