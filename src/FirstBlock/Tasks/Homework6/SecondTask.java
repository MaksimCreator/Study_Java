package FirstBlock.Tasks.Homework6;

import Service_Locator.IService;

public class SecondTask implements IService
{
    private final int way = 42115;
    private final int wayToMessage = 500;

    private int completedWay = 0;

    public void Print()
    {
        do
        {
            if(completedWay != 0)
                PrintMessage();

            completedWay += wayToMessage;
        } while (completedWay <= way);

        IO.println();
        completedWay = 0;

        for(completedWay = 0; completedWay < way; completedWay += wayToMessage)
        {
            if(completedWay != 0)
                PrintMessage();
        }
    }

    private void PrintMessage()
    {
        IO.print("Держитесь! Осталось ");
        IO.print(way - completedWay);
        IO.println(" метров");
    }
}
