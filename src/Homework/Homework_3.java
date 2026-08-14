package Homework;

import Service_Locator.ServiceLocator;
import Tasks.TasksHomework3.*;

public class Homework_3
{
    private final FirstTask firstTask;
    private final SecondTask secondTask;
    private final ThirdTask thirdTask;
    private final FourthTask fourthTask;
    private final FifthTask fifthTask;
    private final SixthTask sixthTask;
    private final SeventhTask seventhTask;

    public Homework_3(ServiceLocator locator)
    {
        firstTask = locator.GetService(FirstTask.class);
        secondTask = locator.GetService(SecondTask.class);
        thirdTask = locator.GetService(ThirdTask.class);
        fourthTask = locator.GetService(FourthTask.class);
        fifthTask = locator.GetService(FifthTask.class);
        sixthTask = locator.GetService(SixthTask.class);
        seventhTask = locator.GetService(SeventhTask.class);
    }

    public void Print()
    {
        IO.println(1);
        IO.println();
        firstTask.Print();
        IO.println("_______________________________________");

        IO.println(2);
        IO.println();
        secondTask.Print();
        IO.println("_______________________________________");

        IO.println(3);
        IO.println();
        thirdTask.Print();
        IO.println("_______________________________________");

        IO.println(4);
        IO.println();
        fourthTask.Print();
        IO.println("_______________________________________");

        IO.println(5);
        IO.println();
        fifthTask.Print();
        IO.println("_______________________________________");

        IO.println(6);
        IO.println();
        sixthTask.Print();
        IO.println("_______________________________________");

        IO.println(7);
        IO.println();
        seventhTask.Print();
        IO.println("_______________________________________");
    }
}
