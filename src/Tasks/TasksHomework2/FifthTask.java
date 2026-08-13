package Tasks.TasksHomework2;

import Service_Locator.IService;
import Tasks.TextBuilder;

public class FifthTask implements IService
{
    private final TextBuilder _textBuilder = new TextBuilder();

    private final float _whiteCansPerClassroom = 2;
    private final float _brownCansPerClassroom = 4;
    private final float _cans = 120;

    public void Print()
    {
        float classroom = _cans / (_whiteCansPerClassroom + _brownCansPerClassroom);

        _textBuilder.append("В школе, где ")
                .append((int) classroom)
                .append(" классов, нужно ")
                .append(classroom * _whiteCansPerClassroom)
                .append(" банок белой краски и ")
                .append(classroom * _brownCansPerClassroom)
                .append(" банок коричневой краски");

        _textBuilder.Print();
    }
}
