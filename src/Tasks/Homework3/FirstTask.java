package Tasks.Homework3;

import Service_Locator.IService;
import Tasks.TextBuilder;

import java.util.Scanner;

public class FirstTask implements IService
{
    private final TextBuilder textBuilder = new TextBuilder();
    private final Scanner scaner = new Scanner(System.in);

    public void Print()
    {
        IO.println("Введите свой возраст");
        int years = scaner.nextInt();

        if(years < 0)
            throw new IllegalStateException("Invalid Operation");

        if(years >= 18)
            PrintAdult(years);
        else
            PrintNotAdult(years);
    }

    private void PrintAdult(int years)
    {
        if(years < 18)
            throw new IllegalStateException("Invalid Operation");

        textBuilder.append("Если возраст человека равен ")
                .append(years)
                .append(" то он совершеннолетний");

        textBuilder.print();
    }

    private void PrintNotAdult(int years)
    {
        if(years >= 18)
            throw new IllegalStateException("Invalid Operation");

        textBuilder.append("Если возраст человека равен ")
            .append(years)
            .append(" то он не достиг совершеннолетия, нужно немного подождать");

        textBuilder.print();
    }
}
