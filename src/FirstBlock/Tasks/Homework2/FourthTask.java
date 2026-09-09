package FirstBlock.Tasks.Homework2;

import Service_Locator.IService;
import FirstBlock.Tasks.TextBuilder;

public class FourthTask implements IService
{
    private final TextBuilder _textBuilder = new TextBuilder();

    private final int twentyMinutes = 20;
    private final int minutesAtDay = 24 * 60;
    private final int minutesAtThreeDays = minutesAtDay * 3;
    private final int minutesAtMonth = minutesAtDay * 31;
    private final int bottlePerMinuts = 16 / 2;

    public void Print()
    {
        Print(twentyMinutes);
        Print(minutesAtDay);
        Print(minutesAtThreeDays);
        Print(minutesAtMonth);
    }

    private void Print(int timeWorkToMinuts)
    {
        int bottles = timeWorkToMinuts * bottlePerMinuts;

        _textBuilder.append("За ")
                .append(timeWorkToMinuts)
                .append(" минут машина произвела ")
                .append(bottles)
                .append(" штук бутылок");

        _textBuilder.print();
    }
}
