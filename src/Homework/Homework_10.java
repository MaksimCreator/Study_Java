package Homework;

import Service_Locator.ServiceLocator;
import Tasks.Homework10.*;

public class Homework_10
{
    private final FirstTask firstTask;
    private final SecondTask secondTask;
    private final ThirdTask thirdTask;

    public Homework_10(ServiceLocator locator)
    {
        firstTask = locator.GetService(FirstTask.class);
        secondTask = locator.GetService(SecondTask.class);
        thirdTask = locator.GetService(ThirdTask.class);
    }

    public void print()
    {
        IO.println(1);
        IO.println();
        firstTask.print();
        IO.println("_______________________________________");

        IO.println(2);
        IO.println();
        secondTask.print();
        IO.println("_______________________________________");

        IO.println(3);
        IO.println();
        thirdTask.print();
        IO.println("_______________________________________");
    }
}
