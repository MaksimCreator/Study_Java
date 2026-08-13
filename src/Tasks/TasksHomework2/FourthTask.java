package Tasks.TasksHomework2;

import Service_Locator.IService;
import Tasks.TextBuilder;

public class FourthTask implements IService
{
    private final TextBuilder _textBuilder = new TextBuilder();

    private final int _twentyMinutes = 20;
    private final int _minutesAtDay = 24 * 60;
    private final int _minutesAtThreeDays = _minutesAtDay * 3;
    private final int _minutesAtMonth = _minutesAtDay * 31;
    private final int _bottlePerMinuts = 16 / 2;

    public void Print()
    {
        Print(_twentyMinutes);
        Print(_minutesAtDay);
        Print(_minutesAtThreeDays);
        Print(_minutesAtMonth);
    }

    private void Print(int timeWorkToMinuts)
    {
        int bottles = timeWorkToMinuts * _bottlePerMinuts;

        _textBuilder.append("За ")
                .append(timeWorkToMinuts)
                .append(" минут машина произвела ")
                .append(bottles)
                .append(" штук бутылок");

        _textBuilder.Print();
    }
}
