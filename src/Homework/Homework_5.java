package Homework;

import Service_Locator.ServiceLocator;
import Tasks.Homework5.*;

public class Homework_5
{
    private final FirstTask firstTask;
    private final SecondTask secondTask;
    private final ThirdTask thirdTask;
    private final FourthTask fourthTask;
    private final FifthTask fifthTask;
    private final SixthTask sixthTask;
    private final SeventhTask seventhTask;
    private final EighthTask eighthTask;
    private final NinthTask ninthTask;
    private final TenthTask tenthTask;

    public Homework_5(ServiceLocator locator)
    {
        firstTask = locator.GetService(FirstTask.class);
        secondTask = locator.GetService(SecondTask.class);
        thirdTask = locator.GetService(ThirdTask.class);
        fourthTask = locator.GetService(FourthTask.class);
        fifthTask = locator.GetService(FifthTask.class);
        sixthTask = locator.GetService(SixthTask.class);
        seventhTask = locator.GetService(SeventhTask.class);
        eighthTask = locator.GetService(EighthTask.class);
        ninthTask = locator.GetService(NinthTask.class);
        tenthTask = locator.GetService(TenthTask.class);
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

        IO.println(8);
        IO.println();
        eighthTask.Print();
        IO.println("_______________________________________");

        IO.println(9);
        IO.println();
        ninthTask.Print();
        IO.println("_______________________________________");

        IO.println(10);
        IO.println();
        tenthTask.Print();
        IO.println("_______________________________________");
    }
}
