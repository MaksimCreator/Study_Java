package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public void main(){
        Product apple = new Product("Apple", 50);
        Product milk = new Product("Milk", 100);
        Product beard = new Product("Beard", 250);

        ProductBasket basket = new ProductBasket();

        basket.add(apple);
        basket.add(milk);
        basket.add(beard);
        basket.add(apple);
        basket.add(milk);

        basket.add(beard);
        IO.println();

        basket.allPrint();
        IO.println();

        IO.println(basket.getCost());
        IO.println();

        IO.println(basket.checkProductForName("Apple"));
        IO.println();

        IO.println(basket.checkProductForName("Byby_bibi"));
        IO.println();

        basket.clear();
        basket.allPrint();
        IO.println();

        IO.println(basket.getCost());
        IO.println();

        IO.println(basket.checkProductForName("Apple"));
        IO.println();
    }
}
