package FirstBlock.Tasks.Homework9;

import Service_Locator.IService;
import FirstBlock.Tasks.TextBuilder;

import java.util.Scanner;

public class FirstTask implements IService {
    private final Scanner scanner = new Scanner(System.in);
    private final TextBuilder textBuilder = new TextBuilder();
    private final char endAppending = ' ';

    private int startAppendingFirstName = 0;
    private int startAppendingMiddleName;
    private int startAppendingLastName;


    private String firstName;
    private String middleName;
    private String lastName;
    private String fullName;

    public void print() {
        IO.println("Введите свое Ф.И.О");
        fullName = scanner.nextLine();

        startAppendingMiddleName = getNextStartAppend(startAppendingFirstName,fullName,endAppending);
        startAppendingLastName = getNextStartAppend(startAppendingMiddleName,fullName,endAppending);

        firstName = getLineToArray(startAppendingFirstName,fullName,endAppending);
        middleName = getLineToArray(startAppendingMiddleName,fullName,endAppending);
        lastName = getLineToArray(startAppendingLastName,fullName,endAppending);

        IO.print("Ф.И.О сотрудника - ");
        IO.println(fullName);
    }

    private int getNextStartAppend(int startLine,String line,char endAppend) {

        char currentChar;
        char nextChar;
        int length = line.length();

        for(int i = startLine; i < length; i++) {

            if(i + 1 == length)
                break;

            currentChar = line.charAt(i);
            nextChar = line.charAt(i + 1);

            if(currentChar == endAppend && nextChar != endAppend)
                return i + 1;
        }

        return length - 1;
    }

    private String getLineToArray(int start,String line, char endAppend) {

        for(int i = start; i < line.length(); i++) {
            if(endAppend == line.charAt(i))
                return textBuilder.getLine();

            textBuilder.append(line.charAt(i));
        }

        return textBuilder.getLine();
    }
}
