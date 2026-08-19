package Homework;

import Tasks.Homework12.Order;
import Tasks.Homework12.Product;

public class Homework_12 {
    private final Product product1 = new Product(1,"Milk",100,"Food");
    private final Product product2 = new Product(1,"Coffee",150,"Food");
    private final Product product3 = new Product(1,"Pancake",250,"Food");
    private final Product product4 = new Product(2,"Pistol",100000,"Gun");
    private final Product product5 = new Product(2,"Machinegun",150000,"Gun");
    private final Product product6 = new Product(2,"Rpg",250000,"Gun");

    private final String customer1 = "Ivan";
    private final String customer2 = "Peter";

    private final Product[] products1 = {product1,product2,product3};
    private final Product[] products2 = {product4,product5,product6};

    private final Order firstOrder = new Order(customer1,products1);
    private final Order secondOrder = new Order(customer1,products1);
    private final Order thirdOrder = new Order(customer2,products2);

    public void print()
    {
        IO.println(firstOrder.toString());
        IO.println();
        IO.println(secondOrder.toString());
        IO.println();
        IO.println(thirdOrder.toString());
        IO.println();

        IO.println(firstOrder.canEqualsOrder(secondOrder));
        IO.println();
        IO.println(secondOrder.canEqualsOrder(thirdOrder));
    }
}
