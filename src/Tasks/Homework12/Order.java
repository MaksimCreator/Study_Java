package Tasks.Homework12;

import java.util.Arrays;
import java.util.Objects;

public class Order {

    private final String customer;
    private final Product[] basket;

    public Order(String customer,Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    public boolean canEqualsOrder(Order orderEquals)
    {
        if(Objects.equals(customer,orderEquals.customer) == false)
            return false;

        if(basket.length != orderEquals.basket.length)
            return false;

        for(int i = 0; i < basket.length; i++)
        {
            Product equalsProduct = orderEquals.basket[i];

            if(basket[i].equals(equalsProduct) == false)
                return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return Arrays.toString(basket);
    }
}
