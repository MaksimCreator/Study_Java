package Tasks.Homework6;

import Service_Locator.IService;
import Tasks.Input;
import Tasks.TextBuilder;

import java.util.Scanner;

public class ThirdTask implements IService
{
    private final Input input = new Input();
    private final int oneDayPrice = 100;

    public void Print()
    {
        String messageDescription = "Введите ваш бюджет";
        String messageError = "Некоректный ввод, бюджет не может быть меньше 0";

        int money = input.GetPositiveInt(messageDescription,messageError);
        int wallet = money;
        int day = 0;

        while(wallet > 0)
        {
            day++;

            if(day % 5 == 0)
                continue;

            if(wallet <= oneDayPrice)
                wallet = 0;
            else
                wallet -= oneDayPrice;
        }

        IO.print("Вашего бюджета хватить на ");
        IO.println(day);
        IO.println();

        day = 0;

        for(wallet = money; wallet > 0;)
        {
            day++;

            if(day % 5 == 0)
                continue;

            if(wallet <= oneDayPrice)
                wallet = 0;
            else
                wallet -= oneDayPrice;
        }

        IO.print("Вашего бюджета хватить на ");
        IO.println(day);
    }
}
