package Tasks.Homework5;

import Service_Locator.IService;
import Tasks.TextBuilder;

public class EighthTask implements IService
{
    private final int yearsMonth = 12;
    private final int salaryMonth = 29000;

    private int wallet;

    public void Print()
    {
        for(int i = 0; i < yearsMonth; i++)
        {
            wallet += salaryMonth;
            IO.print("Месяц ");
            IO.print(i + 1);
            IO.print(" сумма накоплений равна ");
            IO.print(wallet);
            IO.println(" рублей");
        }
    }
}
