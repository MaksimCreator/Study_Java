package Tasks.Homework2;

import Service_Locator.IService;
import Tasks.TextBuilder;

public class ThirdTask implements IService
{
    private final TextBuilder textBuilder = new TextBuilder();

    private final float studets = 23 + 27 + 30;
    private final float sheets = 480;

    public void Print()
    {
        textBuilder.append("На каждого ученика рассчитано ")
                .append(sheets / studets)
                .append(" листов бумаги");

        textBuilder.print();
    }
}
