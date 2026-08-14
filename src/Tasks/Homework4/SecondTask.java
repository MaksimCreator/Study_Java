package Tasks.Homework4;

import Service_Locator.IService;
import Tasks.Homework4.Entity.BankSystem;
import Tasks.Homework4.Entity.OS;
import Tasks.TextBuilder;

import java.util.Scanner;

public class SecondTask implements IService
{
    private final OS oS = OS.Android;
    private final int yearsPhone = 2010;
    private final BankSystem bank = new BankSystem(oS,yearsPhone);

    public void Print()
    { bank.PrintInstallerText(); }
}
