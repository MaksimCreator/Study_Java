import Homework.Homework_8;
import Service_Locator.ServiceLocator;
import Tasks.Homework8.*;

void main()
{
    int firstFriday = 4;

    FirstTask firstTask = new FirstTask();
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

    Homework_8 homework8 = new Homework_8(serviceLocator);

    homework8.Print();
}