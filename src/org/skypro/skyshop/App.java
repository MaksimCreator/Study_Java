package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public void main(){
        Product apple = new SimpleProduct("Apple", 50);
        Product milk = new DiscountedProduct("Milk", 100,10);
        Product bird = new FixPriceProduct("Bird");

        ProductBasket basket = new ProductBasket();

        basket.add(apple);
        basket.add(milk);
        basket.add(bird);
        basket.add(apple);
        basket.add(milk);

        basket.allPrint();
        IO.println();
    }
}
