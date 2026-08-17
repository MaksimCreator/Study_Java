package Tasks.Homework9;

import Service_Locator.IService;
import Tasks.Homework8.Service;

import java.util.Scanner;

public class SecondTask implements IService
{
    private final Scanner scanner = new Scanner(System.in);

    private String fullName;

    public void print() {
        IO.println("Введите свое Ф.И.О");
        fullName = scanner.nextLine();

        IO.print("Данные Ф. И. О. сотрудника для заполнения отчета — ");
        IO.println(fullName.toUpperCase());
    }
}
