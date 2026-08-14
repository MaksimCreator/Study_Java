import Homework.Homework_3;
import Tasks.TasksHomework3.*;
import Service_Locator.ServiceLocator;

void main()
{
    FirstTask firstTask = new FirstTask();
    SecondTask secondTask = new SecondTask();
    ThirdTask thirdTask = new ThirdTask();
    FourthTask fourthTask = new FourthTask();
    FifthTask fifthTask = new FifthTask();
    SixthTask sixthTask = new SixthTask();
    SeventhTask seventhTask = new SeventhTask();

    ServiceLocator serviceLocator = new ServiceLocator();

    serviceLocator.Registery(FirstTask.class,firstTask);
    serviceLocator.Registery(SecondTask.class,secondTask);
    serviceLocator.Registery(ThirdTask.class,thirdTask);
    serviceLocator.Registery(FourthTask.class,fourthTask);
    serviceLocator.Registery(FifthTask.class,fifthTask);
    serviceLocator.Registery(SixthTask.class,sixthTask);
    serviceLocator.Registery(SeventhTask.class,seventhTask);

    Homework_3 homework_3 = new Homework_3(serviceLocator);

    homework_3.Print();
}