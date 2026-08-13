package Tasks.TasksHomework2;

import Service_Locator.IService;
import Tasks.TextBuilder;

public class EighthTask implements IService
{
    private final TextBuilder _textBuilder = new TextBuilder();

    private final float _mouthInYear = 12;

    private final float _salaryMasha = 67760;
    private final float _salaryDenis = 83690;
    private final float _salaryKristina = 76230;
    private final float _incrementPercent = 10;

    public void Print()
    {
        float newSalaryMasha = IncrementSalary(_salaryMasha);
        float newSalaryDenis = IncrementSalary(_salaryDenis);
        float newSalaryKristina = IncrementSalary(_salaryKristina);

        float yearSalaryMashaNew = newSalaryMasha * _mouthInYear;
        float yearSalaryDenisNew = newSalaryDenis * _mouthInYear;
        float yearSalaryKristinaNew = newSalaryKristina * _mouthInYear;

        float yearSalaryMashaOld = _salaryMasha * _mouthInYear;
        float yearSalaryDenisOld =  _salaryDenis * _mouthInYear;
        float yearSalaryKristinaOld =  _salaryKristina * _mouthInYear;

        Print("Маша", newSalaryMasha,yearSalaryMashaNew - yearSalaryMashaOld);
        Print("Денис", newSalaryDenis,yearSalaryDenisNew - yearSalaryDenisOld);
        Print("Кристина", newSalaryKristina,yearSalaryKristinaNew - yearSalaryKristinaOld);
    }

    private float IncrementSalary(float oldSalary)
    { return oldSalary + (oldSalary / 100 * _incrementPercent); }

    private void Print(String name,float newSalary,float growthYearSalary)
    {
        _textBuilder.append(name)
                .append("теперь получает ")
                .append(newSalary)
                .append(" рублей. Годовой доход вырос на ")
                .append(growthYearSalary)
                .append(" рублей");

        _textBuilder.Print();
    }
}
