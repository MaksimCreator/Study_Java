import Homework.Homework_10;
import Service_Locator.ServiceLocator;
import Tasks.Homework10.*;

void main()
{
    FirstTask firstTask = new FirstTask();
    SecondTask secondTask = new SecondTask();
    ThirdTask thirdTask = new ThirdTask();

    ServiceLocator serviceLocator = new ServiceLocator();

    serviceLocator.Registery(FirstTask.class,firstTask);
    serviceLocator.Registery(SecondTask.class,secondTask);
    serviceLocator.Registery(ThirdTask.class,thirdTask);

    Homework_10 homework10 = new Homework_10(serviceLocator);

    homework10.print();
}