import Homework.Homework_7;
import Service_Locator.ServiceLocator;
import Tasks.Homework7.*;

void main()
{
    int firstFriday = 4;

    FirstTask firstTask = new FirstTask();
    SecondTask secondTask = new SecondTask();
    ThirdTask thirdTask = new ThirdTask();
    FourthTask fourthTask = new FourthTask();

    ServiceLocator serviceLocator = new ServiceLocator();

    serviceLocator.Registery(FirstTask.class,firstTask);
    serviceLocator.Registery(SecondTask.class,secondTask);
    serviceLocator.Registery(ThirdTask.class,thirdTask);
    serviceLocator.Registery(FourthTask.class,fourthTask);

    Homework_7 homework_7 = new Homework_7(serviceLocator);

    homework_7.Print();
}