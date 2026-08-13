import Homework.Homework_2;
import Tasks.TasksHomework2.*;
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
    EighthTask eighthTask = new EighthTask();

    ServiceLocator serviceLocator = new ServiceLocator();

    serviceLocator.Registery(FirstTask.class,firstTask);
    serviceLocator.Registery(SecondTask.class,secondTask);
    serviceLocator.Registery(ThirdTask.class,thirdTask);
    serviceLocator.Registery(FourthTask.class,fourthTask);
    serviceLocator.Registery(FifthTask.class,fifthTask);
    serviceLocator.Registery(SixthTask.class,sixthTask);
    serviceLocator.Registery(SeventhTask.class,seventhTask);
    serviceLocator.Registery(EighthTask.class,eighthTask);

    Homework_2 homework = new Homework_2(serviceLocator);

    homework.Print();
}