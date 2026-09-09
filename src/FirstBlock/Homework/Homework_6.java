package FirstBlock.Homework;

import Service_Locator.ServiceLocator;
import FirstBlock.Tasks.Homework6.*;

public class Homework_6
{
    private final FirstTask firstTask;
    private final SecondTask secondTask;
    private final ThirdTask thirdTask;
    private final FourthTask fourthTask;
    private final FifthTask fifthTask;

    public Homework_6(ServiceLocator locator)
    {
        firstTask = locator.GetService(FirstTask.class);
        secondTask = locator.GetService(SecondTask.class);
        thirdTask = locator.GetService(ThirdTask.class);
        fourthTask = locator.GetService(FourthTask.class);
        fifthTask = locator.GetService(FifthTask.class);
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
    }
}
