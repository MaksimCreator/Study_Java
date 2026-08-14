package Homework;

import Service_Locator.ServiceLocator;
import Tasks.TasksHomework3.*;

public class Homework_3
{
    private final FirstTask _firstTask;
    private final SecondTask _secondTask;
    private final ThirdTask _thirdTask;
    private final FourthTask _fourthTask;
    private final FifthTask _fifthTask;
    private final SixthTask _sixthTask;
    private final SeventhTask _seventhTask;

    public Homework_3(ServiceLocator locator)
    {
        _firstTask = locator.GetService(FirstTask.class);
        _secondTask = locator.GetService(SecondTask.class);
        _thirdTask = locator.GetService(ThirdTask.class);
        _fourthTask = locator.GetService(FourthTask.class);
        _fifthTask = locator.GetService(FifthTask.class);
        _sixthTask = locator.GetService(SixthTask.class);
        _seventhTask = locator.GetService(SeventhTask.class);
    }

    public void Print()
    {
        IO.println(1);
        IO.println();
        _firstTask.Print();
        IO.println("_______________________________________");

        IO.println(2);
        IO.println();
        _secondTask.Print();
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
    }
}
