import Homework.Homework_6;
import Service_Locator.ServiceLocator;
import Tasks.Homework6.*;

void main()
{
    int firstFriday = 4;

    FirstTask firstTask = new FirstTask(firstFriday);
    SecondTask secondTask = new SecondTask();
    ThirdTask thirdTask = new ThirdTask();
    FourthTask fourthTask = new FourthTask();
    FifthTask fifthTask = new FifthTask();

    ServiceLocator serviceLocator = new ServiceLocator();

    serviceLocator.Registery(FirstTask.class,firstTask);
    serviceLocator.Registery(SecondTask.class,secondTask);
    serviceLocator.Registery(ThirdTask.class,thirdTask);
    serviceLocator.Registery(FourthTask.class,fourthTask);
    serviceLocator.Registery(FifthTask.class,fifthTask);

    Homework_6 homework_6 = new Homework_6(serviceLocator);

    homework_6.Print();
}