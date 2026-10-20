package org.skypro.skyshop.basket;

import java.util.Objects;
import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private final Product[] products = new Product[5];

    public void add(Product product) {
        for(int i = 0; i < products.length; i++){
            if(products[i] == null){
                products[i] = product;
                break;
            }
            else if(i + 1 == products.length){
                IO.println("Невозможно добавить продукт");
            }
        }
    }

    public int getCost(){
        int cost = 0;

        for(int i = 0; i < products.length; i++){
            Product product = products[i];

            if(product != null)
                cost += products[i].Price;
        }

        return cost;
    }

    public void allPrint(){
        boolean canEmpty = true;
        int countSpecialProduct = 0;

        for(int i = 0; i < products.length; i++){
            Product product = products[i];

            if (product == null)
                continue;

            if(canEmpty)
                canEmpty = false;

            if(product.isSpecial())
                countSpecialProduct += 1;

            IO.println(product.toString());
        }

        if(canEmpty == false){
            IO.print("Итого: ");
            IO.println(getCost());
        }
        else{
            IO.println("в корзине пусто");
        }

        IO.print("Специальных товаров: ");
        IO.println(countSpecialProduct);
    }

    public boolean checkProductForName(String name){
        for(int i = 0; i < products.length; i++){
            Product product = products[i];

            if(product == null)
                continue;

            if(Objects.equals(product.Name,name))
                return true;
        }

        return false;
    }

    public void clear(){
        for(int i = 0; i < products.length; i++)
            products[i] = null;
    }
}
