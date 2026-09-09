package FirstBlock.Tasks.Homework3;

import Service_Locator.IService;
import FirstBlock.Tasks.TextBuilder;

import java.util.Scanner;

public class SecondTask implements IService
{
    private final TextBuilder textBuilder = new TextBuilder();
    private final Scanner scaner = new Scanner(System.in);

    public void Print()
    {
        IO.println("Введите температуру воздуха на улице");
        float degrees = scaner.nextFloat();

        if(degrees <= 5)
            PrintCold(degrees);
        else
            PrintHot(degrees);
    }

    private void PrintCold(float degrees)
    {
        if(degrees > 5)
            throw new IllegalStateException("Invalid Operation");

        textBuilder.append("На улице ")
                .append(degrees)
                .append(" градусов, нужно надеть шапку");

        textBuilder.print();
    }

    private void PrintHot(float degrees)
    {
        if(degrees <= 5)
            throw new IllegalStateException("Invalid Operation");

        textBuilder.append("На улице ")
                .append(degrees)
                .append(" градусов, можно идти без шапки");

        textBuilder.print();
    }
}
