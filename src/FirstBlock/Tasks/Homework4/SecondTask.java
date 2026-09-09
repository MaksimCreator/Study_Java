package FirstBlock.Tasks.Homework4;

import Service_Locator.IService;
import FirstBlock.Tasks.Homework4.Entity.BankSystem;
import FirstBlock.Tasks.Homework4.Entity.OS;

public class SecondTask implements IService
{
    private final OS oS = OS.Android;
    private final int yearsPhone = 2010;
    private final BankSystem bank = new BankSystem(oS,yearsPhone);

    public void Print()
    { bank.PrintInstallerText(); }
}
