package Tasks.Homework12;

import Tasks.TextBuilder;
import java.util.Objects;

public class Product {
    private final TextBuilder builder = new TextBuilder();

    private final int id;
    private final String name;
    private final int price;
    private final String category;

    public Product(int id, String name,int price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            throw new IllegalStateException();

        Product productEquals;

        if(obj instanceof Product == false)
            return false;

        productEquals = (Product) obj;

        if(id == productEquals.id && Objects.equals(category,productEquals.category))
            return true;

        return false;
    }

    @Override
    public String toString() {
        builder.append("Товар[артикул= ")
                .append(id)
                .append(", название= ")
                .append(name)
                .append(", цена= ")
                .append(price)
                .append(", категория= ")
                .append(category);

        return builder.getLine();
    }
}
