package FirstBlock.Tasks.Homework4;

import Service_Locator.IService;

public class FourthTask implements IService
{
    private final int deliveryDistance = 95;
    private final int oneDayDelivery = 20;
    private final int twoDayDelivery = 60;
    private final int threeDayDelivery = 100;

    private int deliveryDay;
    private boolean isDelivery;

    public void Print()
    {
        isDelivery = true;

        if(deliveryDistance < 0)
            throw new IllegalStateException();

        if(deliveryDistance <= oneDayDelivery)
            deliveryDay = 1;
        else if(deliveryDistance > oneDayDelivery && deliveryDistance <= twoDayDelivery)
            deliveryDay = 2;
        else if(deliveryDistance > twoDayDelivery && deliveryDistance <= threeDayDelivery)
            deliveryDay = 3;
        else if(deliveryDistance > threeDayDelivery)
            isDelivery = false;

        IO.print("Потребуется дней: ");

        if(isDelivery == false)
            IO.println("доставки нет");
        else
            IO.println(deliveryDay);
    }
}
