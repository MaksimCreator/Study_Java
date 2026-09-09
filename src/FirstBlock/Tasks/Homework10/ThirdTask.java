package FirstBlock.Tasks.Homework10;

import Service_Locator.IService;
import FirstBlock.Tasks.TextBuilder;

import java.util.Scanner;

public class ThirdTask implements IService
{
    private final Scanner scanner = new Scanner(System.in);
    private final TextBuilder textBuilder = new TextBuilder();

    private final int oneDayDelivery = 20;
    private final int twoDayDelivery = 60;
    private final int threeDayDelivery = 100;

    private boolean isDelivery;

    public void print()
    {
        int distance;
        while (true)
        {
            IO.println("Введите растония доставки");
            distance = scanner.nextInt();

            if(distance >= 0)
                break;

            IO.println("Введено не коректное число");
            IO.println();
        }

        int deliveryDay = getDayDelivery(distance);

        IO.print("Потребуется дней: ");

        if(deliveryDay == 0)
            IO.println("доставки нет");
        else
            IO.println(deliveryDay);
    }

    private int getDayDelivery(int deliveryDistance){
        int deliveryDay = 0;

        if(deliveryDistance < 0)
            throw new IllegalStateException();

        if(deliveryDistance <= oneDayDelivery)
            deliveryDay = 1;
        else if(deliveryDistance > oneDayDelivery && deliveryDistance <= twoDayDelivery)
            deliveryDay = 2;
        else if(deliveryDistance > twoDayDelivery && deliveryDistance <= threeDayDelivery)
            deliveryDay = 3;
        else if(deliveryDistance > threeDayDelivery)
            deliveryDay = 0;

        return deliveryDay;
    }
}
