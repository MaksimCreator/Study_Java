package Tasks.Homework6;

import Service_Locator.IService;
import Tasks.Input;
import Tasks.TextBuilder;

import java.util.Scanner;
import java.util.function.IntUnaryOperator;

public class ThirdTask implements IService
{
    private final Input input = new Input();
    private final int oneDayPrice = 100;

    public void Print()
    {
        IntUnaryOperator getDayWhile = (wallet) -> GetDayParkingWhile(wallet);
        IntUnaryOperator getDayFor = (wallet) -> GetDayParkingFor(wallet);

        String messageDescription = "Введите ваш бюджет";
        String messageError = "Некоректный ввод, бюджет не может быть меньше 0";

        int money = input.GetPositiveInt(messageDescription,messageError);

        ParkingLogic(money,getDayWhile);
        IO.println();
        ParkingLogic(money,getDayFor);
    }

    private void ParkingLogic(int money, IntUnaryOperator getDay)
    {
        String messageDay = "";

        int day = getDay.applyAsInt(money);

        if(day < 0)
            throw new IllegalStateException();

        String dayToString = Integer.toString(day);
        char lastFigure = dayToString.charAt(dayToString.length() - 1);

        switch (lastFigure)
        {
            case '0','5','6','7','8','9':
                messageDay = " дней";
                break;
            case '2','3','4':
                messageDay = " дня";
                break;
            case '1':
                messageDay = " день";
                break;
        }

        if(dayToString.charAt(dayToString.length() - 2) == '1')
            messageDay = " дней";

        IO.print("Вашего бюджета хватить на ");
        IO.print(day);
        IO.println(messageDay);
    }

    private int GetDayParkingFor(int money)
    {
        int day = 0;

        for(money = money; money > 0;)
        {
            day++;

            if(day % 5 == 0)
                continue;

            if(money <= oneDayPrice)
                money = 0;
            else
                money -= oneDayPrice;
        }

        return day;
    }

    private int GetDayParkingWhile(int money)
    {
        int day = 0;

        while(money > 0)
        {
            day++;

            if(day % 5 == 0)
                continue;

            if(money <= oneDayPrice)
                money = 0;
            else
                money -= oneDayPrice;
        }

        return day;
    }
}
