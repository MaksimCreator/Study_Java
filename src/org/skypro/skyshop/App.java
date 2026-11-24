package org.skypro.skyshop;

import org.skypro.skyshop.Interface.Searchable;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public void main(){
        try {
            FixPriceProduct product = new FixPriceProduct(null);
            SimpleProduct product1 = new SimpleProduct("product1",-10);
            DiscountedProduct product2 = new DiscountedProduct("product2",100,200);
        }
        catch (IllegalArgumentException arg) {
            IO.println("IllegalArgumentException");
        }

        SearchEngine engine = new SearchEngine();

        engine.add(new Article("1", "description"));
        engine.add(new Article("2", " d d d"));
        engine.add(new Article("3", "description, description"));
        engine.add(new Article("4", "Описания"));

        Searchable searchable = engine.findBestMatchSearchable("description");
        IO.println(searchable.getStringRepresentation());
    }
}
