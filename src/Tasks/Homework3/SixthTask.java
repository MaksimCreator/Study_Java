package Tasks.Homework3;

import Service_Locator.IService;
import Tasks.TextBuilder;

import java.util.Scanner;

public class SixthTask implements IService
{
    private final TextBuilder textBuilder = new TextBuilder();
    private final Scanner scaner = new Scanner(System.in);

    private int trainCapacity = 102;
    private int maxSeatingPlaces = 60;
    private int maxStandingPlaces = trainCapacity - maxSeatingPlaces;

    public void Print()
    {
        int busySeatingPlaces = Input("сидячих",maxSeatingPlaces);
        int busyStandingPlaces = Input("стоячих",maxStandingPlaces);

        PrintFreePlaces(busySeatingPlaces,busyStandingPlaces);
    }

    private void PrintFreePlaces(int busySeatingPlaces,int busyStandingPlaces)
    {
        if(busySeatingPlaces < 0 || busyStandingPlaces < 0)
            throw new IllegalStateException();

        int freeSeatingPlaces = maxSeatingPlaces - busySeatingPlaces;
        int freeStandingPlaces = maxStandingPlaces - busyStandingPlaces;

        if(freeSeatingPlaces < 0 || freeStandingPlaces < 0)
            throw new IllegalStateException();

        if(freeSeatingPlaces > 0 || freeStandingPlaces > 0)
        {
            textBuilder.append("В вагоне доступно ")
                    .append(freeStandingPlaces)
                    .append(" стоячих мест и ")
                    .append(freeSeatingPlaces)
                    .append(" сидячих мест ");

        }
        else
        {
            textBuilder.append("Вагон уже полностью забит");
        }

        textBuilder.Print();
    }

    private int Input(String typePlaces,int maxPlaced)
    {
        int busyPlaces;

        while (true)
        {
            IO.print("Введите сколько занято ");
            IO.print(typePlaces);
            IO.println(" мест");

            busyPlaces = scaner.nextInt();

            if(busyPlaces > maxPlaced)
            {
                IO.print("Некоректный ввод. Всего доступно ");
                IO.print(maxPlaced);
                IO.print(" ");
                IO.print(typePlaces);
                IO.println(" мест");
                IO.println();
            }
            else if (busyPlaces < 0)
            {
                IO.println("Некоректный ввод. Отрицательного показателя мест не может быть ");
                IO.println();
            }
            else
            {
                return busyPlaces;
            }
        }
    }
}
