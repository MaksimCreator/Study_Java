package org.skypro.skyshop.basket;

import java.util.*;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private List<Product> products = new LinkedList<>();

    public ProductBasket add(Product product) {
        if(product == null)
            throw new IllegalArgumentException();

        products.add(product);
        return this;
    }

    public int getCost(){
        int cost = 0;

        for(Product product: products)
            cost += product.Price;

        return cost;
    }

    public void allPrint(){
        int countSpecialProduct = 0;

        if(products.isEmpty()){
            IO.println("в корзине пусто");
            return;
        }

        for(Product product: products){
            if(product.isSpecial())
                countSpecialProduct += 1;

            IO.println(product.toString());
        }

        IO.print("Итого: ");
        IO.println(getCost());
        IO.print("Специальных товаров: ");
        IO.println(countSpecialProduct);
    }

    public boolean checkProductForName(String name){
        for(Product product: products){
            if(Objects.equals(product.Name,name))
                return true;
        }

        return false;
    }

    public List<Product> deleteProductToName(String name){
        List<Product> removedProducts = new LinkedList<>();
        Iterator<Product> iterator = products.iterator();
        Product product;

        while(iterator.hasNext()){
            product = iterator.next();

            if(product.Name.equals(name)){
                iterator.remove();
                removedProducts.add(product);
            }
        }

        return  removedProducts;
    }

    public void clear() { products = new LinkedList<>(); }
}