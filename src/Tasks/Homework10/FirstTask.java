package Tasks.Homework10;

import Service_Locator.IService;
import Tasks.TextBuilder;

import java.util.Scanner;

public class FirstTask implements IService {
    private final Scanner scanner = new Scanner(System.in);
    private final TextBuilder textBuilder = new TextBuilder();

    public void print() {
        IO.println("Введите год");
        String message = canYearLeap(scanner.nextInt());
        IO.println(message);
    }

    private String canYearLeap(int year)
    {
        if (year % 4 == 0) {
            textBuilder.append(year)
                    .append(" год является високосным");
        }
        else {
            textBuilder.append(year)
                    .append(" год не является високосным");
        }

        return textBuilder.getLine();
    }
}
