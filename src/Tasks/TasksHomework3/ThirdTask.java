package Tasks.TasksHomework3;

import Service_Locator.IService;
import Tasks.TextBuilder;

import java.util.Scanner;

public class ThirdTask implements IService
{
    private final TextBuilder textBuilder = new TextBuilder();
    private final Scanner scaner = new Scanner(System.in);

    public void Print()
    {
        IO.println("Введите скорость автотранспорта");
        float speed = scaner.nextFloat();

        if(speed < 0)
            throw new IllegalStateException("Invalid Operation");

        if(speed < 60)
            PrintNotSpeedLimitExceeded(speed);
        else
            PrintSpeedLimitExceeded(speed);
    }

    private void PrintSpeedLimitExceeded(float speed)
    {
        if(speed <= 60)
            throw new IllegalStateException("Invalid Operation");

        textBuilder.append("Если скорость ")
                .append(speed)
                .append(" то придется заплатить штраф");

        textBuilder.Print();
    }

    private void PrintNotSpeedLimitExceeded(float speed)
    {
        if(speed > 60)
            throw new IllegalStateException("Invalid Operation");

        textBuilder.append("Если скорость ")
                .append(speed)
                .append(" то можно ездить спокойно");

        textBuilder.Print();
    }
}
