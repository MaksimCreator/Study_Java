package FirstBlock.Tasks.Homework10;

import Service_Locator.IService;
import FirstBlock.Tasks.Homework10.Entity.BankSystem;
import FirstBlock.Tasks.Homework10.Entity.OS;
import java.time.LocalDate;
import java.util.Scanner;

public class SecondTask implements IService
{
    private final Scanner scanner = new Scanner(System.in);
    private final BankSystem bankSystem = new BankSystem();

    private final int currentYear = LocalDate.now().getYear();

    public void print() {

        int os;
        int clientDeviceYear;

        while(true) {
            IO.println("Введите 0 если ваша OS iOS и 1 если Android");
            os = scanner.nextInt();

            if(os == 0) {
                os = bankSystem.getOS(OS.IOS);
                break;
            }
            else if(os == 1) {
                os = bankSystem.getOS(OS.Android);
                break;
            }

            IO.println("Введенно не некоректное число");
            IO.println();
        }

        while (true) {    
            IO.println("Введите год выпуска вашего устройства");
            clientDeviceYear = scanner.nextInt();

            if(clientDeviceYear >= 2007 && clientDeviceYear <= currentYear)
                break;
            
            IO.println("Введенно не некоректное число");
            IO.println();
        }

        bankSystem.printInstallerText(os,clientDeviceYear);
    }

}