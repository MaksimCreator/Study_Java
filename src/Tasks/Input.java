package Tasks;

import java.util.Scanner;

public class Input
{
    private final Scanner scanner = new Scanner(System.in);

    public int GetPositiveInt(String messageDescription,String messageError)
    {
        int result;

        while(true)
        {
            IO.println(messageDescription);
            result = scanner.nextInt();

            if(result >= 0)
                break;

            IO.println(messageError);
            IO.println();
        }

        return result;
    }
}
