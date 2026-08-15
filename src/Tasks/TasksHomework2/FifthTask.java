package Tasks.TasksHomework2;

import Service_Locator.IService;
import Tasks.TextBuilder;

public class FifthTask implements IService
{
    private final TextBuilder textBuilder = new TextBuilder();

    private final float whiteCansPerClassroom = 2;
    private final float brownCansPerClassroom = 4;
    private final float cans = 120;

    public void Print()
    {
        float classroom = cans / (whiteCansPerClassroom + brownCansPerClassroom);

        textBuilder.append("В школе, где ")
                .append((int) classroom)
                .append(" классов, нужно ")
                .append(classroom * whiteCansPerClassroom)
                .append(" банок белой краски и ")
                .append(classroom * brownCansPerClassroom)
                .append(" банок коричневой краски");

        textBuilder.Print();
    }
}
