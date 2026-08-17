package Tasks.Homework10;

import Service_Locator.IService;
import Tasks.Homework10.Entity.BankSystem;
import Tasks.Homework10.Entity.OS;

import java.util.Scanner;

public class SecondTask implements IService
{
    private final Scanner scanner = new Scanner(System.in);
    private final BankSystem bankSystem = new BankSystem();

    public void print() {

        int os;

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

        IO.println("Введите год выпуска вашего устройства");
        int clientDeviceYear = scanner.nextInt();

        bankSystem.printInstallerText(os,clientDeviceYear);
    }
}