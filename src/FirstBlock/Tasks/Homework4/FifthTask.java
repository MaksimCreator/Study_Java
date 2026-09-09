package FirstBlock.Tasks.Homework4;

import Service_Locator.IService;

public class FifthTask implements IService
{
    private final String winter = "Зима";
    private final String spring = "Весна";
    private final String summer = "Лето";
    private final String autumn = "Осень";

    private final int monthNumber = 12;

    public void Print()
    {
        switch (monthNumber)
        {
            case 1,2,12:
                IO.println(winter);
                break;
            case 3,4,5:
                IO.println(spring);
                break;
            case 6,7,8:
                IO.println(summer);
                break;
            case 9,10,11:
                IO.println(autumn);
                break;
            default:
                throw new IllegalStateException();
        }
    }
}
