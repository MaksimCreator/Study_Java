package Tasks.TasksHomework3;

import Service_Locator.IService;
import Tasks.TextBuilder;

import java.util.Scanner;

public class SeventhTask implements IService
{
    private final TextBuilder textBuilder = new TextBuilder();
    private final Scanner scaner = new Scanner(System.in);

    public void Print()
    {
        int one,two,three,max;

        IO.println("Введите первое число");
        one = scaner.nextInt();

        IO.println("Введите второе число");
        two = scaner.nextInt();

        IO.println("Введите третие число");
        three = scaner.nextInt();

        max = GetMaxNumber(one,two);
        max = GetMaxNumber(three,max);

        IO.print("Самое наибольшее число: ");
        IO.print(max);
        IO.println();
    }

    private int GetMaxNumber(int first,int second)
    {
        if(first > second)
            return first;
        else
            return second;
    }
}
