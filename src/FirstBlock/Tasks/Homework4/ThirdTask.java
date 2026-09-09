package FirstBlock.Tasks.Homework4;

import Service_Locator.IService;
import FirstBlock.Tasks.TextBuilder;

import java.util.Scanner;

public class ThirdTask implements IService
{
    private final TextBuilder textBuilder = new TextBuilder();
    private final Scanner scanner = new Scanner(System.in);

    public void Print()
    {
        int year;

        while (true)
        {
            IO.println("Введите год, более чем 1584");
            year = scanner.nextInt();

            if(year <= 1584)
                IO.println("Введен не коректный год, попробуте еще раз");
            else
                break;

            IO.println();
        }

        if(year % 4 == 0)
        {
            textBuilder.append(year)
                    .append(" год является високосным");

            textBuilder.print();
        }
        else
        {
            textBuilder.append(year)
                    .append(" год не является високосным");

            textBuilder.print();
        }
    }
}
