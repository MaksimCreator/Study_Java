package Tasks.Homework4;

import Service_Locator.IService;
import Tasks.Homework4.Entity.BankSystem;
import Tasks.Homework4.Entity.OS;

public class FirstTask implements IService
{
    private final OS oS = OS.IOS;
    private final int yearsPhone = 2024;
    private final BankSystem bank = new BankSystem(oS,yearsPhone);

    public void Print()
    { bank.PrintInstallerText(); }
}
