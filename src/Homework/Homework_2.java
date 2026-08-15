package Homework;

import Tasks.TasksHomework2.*;
import Service_Locator.ServiceLocator;

public class Homework_2
{
    private final FirstTask _firstTask;
    private final ThirdTask _thirdTask;
    private final FourthTask _fourthTask;
    private final FifthTask _fifthTask;
    private final SixthTask _sixthTask;
    private final SeventhTask _seventhTask;
    private final EighthTask _eighthTask;

    public Homework_2(ServiceLocator locator)
    {
        _firstTask = locator.GetService(FirstTask.class);
        _thirdTask = locator.GetService(ThirdTask.class);
        _fourthTask = locator.GetService(FourthTask.class);
        _fifthTask = locator.GetService(FifthTask.class);
        _sixthTask = locator.GetService(SixthTask.class);
        _seventhTask = locator.GetService(SeventhTask.class);
        _eighthTask = locator.GetService(EighthTask.class);
    }

    public void Print()
    {
        IO.println(1);
        IO.println();
        _firstTask.Print();
        IO.println("_______________________________________");

        IO.println(3);
        IO.println();
        _thirdTask.Print();
        IO.println("_______________________________________");

        IO.println(4);
        IO.println();
        _fourthTask.Print();
        IO.println("_______________________________________");

        IO.println(5);
        IO.println();
        _fifthTask.Print();
        IO.println("_______________________________________");

        IO.println(6);
        IO.println();
        _sixthTask.Print();
        IO.println("_______________________________________");

        IO.println(7);
        IO.println();
        _seventhTask.Print();
        IO.println("_______________________________________");

        IO.println(8);
        IO.println();
        _eighthTask.Print();
        IO.println("_______________________________________");
    }
}
