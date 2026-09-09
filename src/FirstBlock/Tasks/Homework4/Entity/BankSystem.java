package FirstBlock.Tasks.Homework4.Entity;

public class BankSystem
{
    private final int clientOS;
    private final int clientDeviceYear;

    public BankSystem(OS oS,int clientDeviceYear)
    {
        clientOS = GetOS(oS);
        this.clientDeviceYear = clientDeviceYear;
    }

    private int GetOS(OS oS)
    {
        if(oS == OS.IOS)
            return 0;
        else if(oS == OS.Android)
            return 1;

        throw new IllegalStateException();
    }

    public void PrintInstallerText()
    {
        if(clientOS == GetOS(OS.IOS) && clientDeviceYear >= 2015)
            IO.println("Установите версию приложения для iOS по ссылке");
        else if(clientOS == GetOS(OS.IOS) && clientDeviceYear < 2015)
            IO.println("Установите облегченную версию приложения для iOS по ссылке");
        else if(clientOS == GetOS(OS.Android) && clientDeviceYear >= 2015)
            IO.println("Установите версию приложения для Android по ссылке");
        else if(clientOS == GetOS(OS.Android) && clientDeviceYear < 2015)
            IO.println("Установите облегченную версию приложения для Android по ссылке");
    }
}