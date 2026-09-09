package FirstBlock.Tasks.Homework3;

import Service_Locator.IService;
import FirstBlock.Tasks.TextBuilder;

import java.util.Scanner;

public class FifthTask implements IService
{
    private final TextBuilder textBuilder = new TextBuilder();
    private final Scanner scaner = new Scanner(System.in);

    public void Print()
    {
        IO.println("Введите ваш возраст");
        int years = scaner.nextInt();

        if(years < 0)
            throw new IllegalStateException("Invalid Operation");

        if(years < 5)
            PrintNotRide(years);
        else if (years > 5 && years <= 14)
            PrintRideOnlyWithAdult(years);
        else if (years > 14)
            PrintRide(years);
    }

    private void PrintNotRide(int years)
    {
        if(years > 5)
            throw new IllegalStateException("Invalid Operation");

        textBuilder.append("Если возраст ребенка равен ")
                .append(years)
                .append(" то он не может кататься на аттракционе.");

        textBuilder.print();
    }

    private void PrintRideOnlyWithAdult(int years)
    {
        if(years < 5 || years > 14)
            throw new IllegalStateException("Invalid Operation");

        textBuilder.append("Если возраст ребенка равен ")
                .append(years)
                .append(" то он может кататься только в сопровождении взрослого.")
                .append("Если взрослого нет, то кататься нельзя.");

        textBuilder.print();
    }

    private void PrintRide(int years)
    {
        if(years < 14)
            throw new IllegalStateException("Invalid Operation");

        textBuilder.append("Если возраст ребенка равен ")
                .append(years)
                .append(" то он может кататься без сопровождения взрослого.");

        textBuilder.print();
    }
}
