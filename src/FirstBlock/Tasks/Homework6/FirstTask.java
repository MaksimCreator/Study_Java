package FirstBlock.Tasks.Homework6;

import Service_Locator.IService;

public class FirstTask implements IService
{
    private final int firstFriday;
    private final int endMonth = 31;
    private final int daysWeak = 7;

    public FirstTask(int firstFriday)
    {
        this.firstFriday = firstFriday;
    }

    public void Print()
    {
        for (int i = firstFriday; i <= endMonth; i += daysWeak)
        {
            IO.print("Сегодня пятница, ");
            IO.print(i);
            IO.println("-е число. Необходимо подготовить отчет");
        }
    }
}
