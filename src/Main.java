import Homework.Homework_5;
import Service_Locator.ServiceLocator;
import Tasks.Homework5.*;

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
    NinthTask ninthTask = new NinthTask();
    TenthTask tenthTask = new TenthTask();

    ServiceLocator serviceLocator = new ServiceLocator();

    serviceLocator.Registery(FirstTask.class,firstTask);
    serviceLocator.Registery(SecondTask.class,secondTask);
    serviceLocator.Registery(ThirdTask.class,thirdTask);
    serviceLocator.Registery(FourthTask.class,fourthTask);
    serviceLocator.Registery(FifthTask.class,fifthTask);
    serviceLocator.Registery(SixthTask.class,sixthTask);
    serviceLocator.Registery(SeventhTask.class,seventhTask);
    serviceLocator.Registery(EighthTask.class,eighthTask);
    serviceLocator.Registery(NinthTask.class,ninthTask);
    serviceLocator.Registery(TenthTask.class,tenthTask);

    Homework_5 homework_5 = new Homework_5(serviceLocator);

    homework_5.Print();
}