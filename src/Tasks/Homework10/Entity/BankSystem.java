package Tasks.Homework10.Entity;

import java.time.LocalDate;

public class BankSystem
{
    private final int currentYear = LocalDate.now().getYear();

    public int getOS(OS oS)
    {
        if(oS == OS.IOS)
            return 0;
        else if(oS == OS.Android)
            return 1;

        throw new IllegalStateException();
    }

    public void printInstallerText(int oS,int clientDeviceYear)
    {
        if(oS == getOS(OS.IOS) && clientDeviceYear > currentYear)
            IO.println("Установите облегченную версию приложения для iOS по ссылке");
        else if(oS == getOS(OS.IOS) && clientDeviceYear <= currentYear)
            IO.println("Установите версию приложения для iOS по ссылке");
        else if(oS == getOS(OS.Android) && clientDeviceYear > currentYear)
            IO.println("Установите облегченную версию приложения для Android по ссылке");
        else if(oS == getOS(OS.Android) && clientDeviceYear <= currentYear)
            IO.println("Установите версию приложения для Android по ссылке");
    }
}