import Homework.Homework_9;
import Service_Locator.ServiceLocator;
import Tasks.Homework9.*;

void main()
{
    FirstTask firstTask = new FirstTask();
    SecondTask secondTask = new SecondTask();
    ThirdTask thirdTask = new ThirdTask();

    ServiceLocator serviceLocator = new ServiceLocator();

    serviceLocator.Registery(FirstTask.class,firstTask);
    serviceLocator.Registery(SecondTask.class,secondTask);
    serviceLocator.Registery(ThirdTask.class,thirdTask);

    Homework_9 homework9 = new Homework_9(serviceLocator);

    homework9.print();
}