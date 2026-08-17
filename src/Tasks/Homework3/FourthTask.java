package Tasks.Homework3;

import Service_Locator.IService;
import Tasks.TextBuilder;

import java.util.Scanner;

public class FourthTask implements IService
{
    private final TextBuilder textBuilder = new TextBuilder();
    private final Scanner scaner = new Scanner(System.in);

    public void Print()
    {
        IO.println("Введите ваш возраст");
        int years = scaner.nextInt();

        if(years < 0)
            throw new IllegalStateException("Invalid Operation");

        if(years >= 2 && years <= 6)
            PrintKindergarten(years);
        else if (years >= 7 && years <= 17)
            PrintSchool(years);
        else if (years >= 18 && years <= 24)
            PrintUniversity(years);
        else if (years > 24)
            PrintWork(years);
    }

    private void PrintKindergarten(int years)
    {
        if(years < 2 || years > 6)
            throw new IllegalStateException("Invalid Operation");

        textBuilder.append("Если возраст человека равен ")
                .append(years)
                .append(" то ему нужно ходить в детский сад.");

        textBuilder.Print();
    }

    private void PrintSchool(int years)
    {
        if(years < 6 || years > 17)
            throw new IllegalStateException("Invalid Operation");

        textBuilder.append("Если возраст человека равен ")
                .append(years)
                .append(" то ему нужно ходить в школу.");

        textBuilder.Print();
    }

    private void PrintUniversity(int years)
    {
        if(years < 18 || years > 24)
            throw new IllegalStateException("Invalid Operation");

        textBuilder.append("Если возраст человека равен ")
                .append(years)
                .append(" то его место в университете.");

        textBuilder.Print();
    }

    private void PrintWork(int years)
    {
        if(years <= 24)
            throw new IllegalStateException("Invalid Operation");

        textBuilder.append("Если возраст человека равен ")
                .append(years)
                .append(" то ему пора ходить на работу.");

        textBuilder.Print();
    }
}
