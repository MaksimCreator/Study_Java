package Tasks.Homework10;

import Service_Locator.IService;
import Tasks.TextBuilder;
import java.util.Scanner;

public class FirstTask implements IService {
    private final Scanner scanner = new Scanner(System.in);
    private final TextBuilder textBuilder = new TextBuilder();

    public void print() {
        IO.println("Введите год");
        String message = getMessageYearLeap(scanner.nextInt());
        IO.println(message);
    }

    private String getMessageYearLeap(int year)
    {
        if (canYearLeap(year)) {
            textBuilder.append(year)
                    .append(" год является високосным");
        }
        else {
            textBuilder.append(year)
                    .append(" год не является високосным");
        }

        return textBuilder.getLine();
    }

    private boolean canYearLeap(int year)
    { return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0); }
}
