package Tasks.Homework2;

import Service_Locator.IService;
import Tasks.TextBuilder;

public class EighthTask implements IService
{
    private final TextBuilder textBuilder = new TextBuilder();

    private final float mouthInYear = 12;

    private final float salaryMasha = 67760;
    private final float salaryDenis = 83690;
    private final float salaryKristina = 76230;
    private final float incrementPercent = 10;

    public void Print()
    {
        float newSalaryMasha = IncrementSalary(salaryMasha);
        float newSalaryDenis = IncrementSalary(salaryDenis);
        float newSalaryKristina = IncrementSalary(salaryKristina);

        float yearSalaryMashaNew = newSalaryMasha * mouthInYear;
        float yearSalaryDenisNew = newSalaryDenis * mouthInYear;
        float yearSalaryKristinaNew = newSalaryKristina * mouthInYear;

        float yearSalaryMashaOld = salaryMasha * mouthInYear;
        float yearSalaryDenisOld =  salaryDenis * mouthInYear;
        float yearSalaryKristinaOld =  salaryKristina * mouthInYear;

        Print("Маша", newSalaryMasha,yearSalaryMashaNew - yearSalaryMashaOld);
        Print("Денис", newSalaryDenis,yearSalaryDenisNew - yearSalaryDenisOld);
        Print("Кристина", newSalaryKristina,yearSalaryKristinaNew - yearSalaryKristinaOld);
    }

    private float IncrementSalary(float oldSalary)
    { return oldSalary + (oldSalary / 100 * incrementPercent); }

    private void Print(String name,float newSalary,float growthYearSalary)
    {
        textBuilder.append(name)
                .append(" теперь получает ")
                .append(newSalary)
                .append(" рублей. Годовой доход вырос на ")
                .append(growthYearSalary)
                .append(" рублей");

        textBuilder.print();
    }
}
