package FirstBlock.Tasks.Homework6;

import Service_Locator.IService;

public class FifthTask implements IService
{
    private final int chargePerMinute = 2;
    private final int minutesForOverheats = 10;
    private final int stopWorkingMinute = 2;
    private final int countOverheatsToStop = 3;

    private int charge = 20;
    private int minute = 0;
    private int minuteOverheats = 0;
    private int overheats = 0;

    public void Print()
    {
        while(true)
        {
            minute++;

            if(minute % minutesForOverheats == 0)
            {
                overheats++;

                if(overheats == countOverheatsToStop)
                {
                    IO.print("Зарядка прекращена. Текущий заряд: ");
                    IO.print(charge);
                    break;
                }
                else
                {
                    minuteOverheats += stopWorkingMinute;
                    continue;
                }
            }

            if(charge + chargePerMinute >= 100)
            {
                charge = 100;
                IO.print("Зарядка выполнена.");
                break;
            }
            else
            {
                charge += chargePerMinute;
            }
        }

        IO.print(" Время потраченно: ");
        IO.println(minute + minuteOverheats);
    }
}
