package Tasks.Homework5;

import Service_Locator.IService;

public class NinthTask implements IService
{
    private final float yearsMonth = 12;
    private final float percentToYear = 12 / yearsMonth;

    private float salaryMonth = 29000;
    private float wallet;

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

            salaryMonth += salaryMonth / 100 * percentToYear;
        }
    }
}
