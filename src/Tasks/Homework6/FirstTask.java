package Tasks.Homework6;

import Service_Locator.IService;
import Tasks.Homework4.Entity.BankSystem;
import Tasks.Homework4.Entity.OS;

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
