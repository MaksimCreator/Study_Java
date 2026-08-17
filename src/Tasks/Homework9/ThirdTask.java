package Tasks.Homework9;

import Service_Locator.IService;
import Tasks.Homework8.Service;
import Tasks.TextBuilder;

import java.util.Scanner;

public class ThirdTask implements IService
{
    private final Scanner scanner = new Scanner(System.in);
    private final TextBuilder textBuilder = new TextBuilder();

    private final char charSwitch = 'ё';
    private final char newChar = 'е';

    private String fullName;

    public void print() {

        IO.println("Введите свое Ф.И.О");
        fullName = scanner.nextLine();

        fullName = SwitchCharsToNewChars(charSwitch,newChar,fullName);

        IO.print("Данные Ф.И.О сотрудника для заполнения отчета — ");
        IO.println(fullName);
    }

    private String SwitchCharsToNewChars(char charSwitch, char newChar, String line) {

        char currentChar;

        for(int i = 0; i < line.length(); i++) {

            currentChar = line.charAt(i);

            if(currentChar == charSwitch)
                textBuilder.append(newChar);
            else
                textBuilder.append(currentChar);
        }

        return textBuilder.getLine();
    }
}
