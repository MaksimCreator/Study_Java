package FirstBlock.Homework;

import Service_Locator.ServiceLocator;
import FirstBlock.Tasks.Homework7.*;

public class Homework_7
{
    private final FirstTask firstTask;
    private final SecondTask secondTask;
    private final ThirdTask thirdTask;
    private final FourthTask fourthTask;

    public Homework_7(ServiceLocator locator)
    {
        firstTask = locator.GetService(FirstTask.class);
        secondTask = locator.GetService(SecondTask.class);
        thirdTask = locator.GetService(ThirdTask.class);
        fourthTask = locator.GetService(FourthTask.class);
    }

    public void Print()
    {
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
    }
}
