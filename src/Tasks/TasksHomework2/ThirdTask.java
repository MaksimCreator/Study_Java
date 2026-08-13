package Tasks.TasksHomework2;

import Service_Locator.IService;
import Tasks.TextBuilder;

public class ThirdTask implements IService
{
    private final TextBuilder _textBuilder = new TextBuilder();

    private final float _studets = 23 + 27 + 30;
    private final float _sheets = 480;

    public void Print()
    {
        _textBuilder.append("На каждого ученика рассчитано ")
                .append(_sheets / _studets)
                .append(" листов бумаги");

        _textBuilder.Print();
    }
}
