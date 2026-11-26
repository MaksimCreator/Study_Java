package org.skypro.skyshop;

import org.skypro.skyshop.Interface.Searchable;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.SimpleProduct;

import java.util.Iterator;
import java.util.List;

public class App {
    public void main(){
        FixPriceProduct product = new FixPriceProduct("product");
        SimpleProduct product1 = new SimpleProduct("product1",10);
        DiscountedProduct product2 = new DiscountedProduct("product2",100,20);

        ProductBasket basket = new ProductBasket().add(product).add(product1).add(product2);
        IO.println();
        IO.println(basket.deleteProductToName("product").getFirst().getStringRepresentation());
        IO.println();
        basket.allPrint();
        IO.println();

        if(basket.deleteProductToName("product").isEmpty())
            IO.println("Список пуст");

        IO.println();
        basket.allPrint();




        IO.println("______________________________________________________________");



        SearchEngine engine = new SearchEngine();

        engine.add(new Article("1", "description"));
        engine.add(new Article("2", " d d d"));
        engine.add(new Article("3", "description, description"));
        engine.add(new Article("4", "Описания"));

        List<Searchable> searchables = engine.search("description");

        for (Searchable item: searchables)
            IO.println(item.getStringRepresentation());
    }
}
