void main()
{
    var dog = 8.0;
    var cat = 3.6;
    var paper = 763789;
    var animalsAdded = 4;
    var dogDivider = 3.5;
    var catDivider = 1.6;
    var paperDivider = 7639;
    var friend = 19;
    var friendAdded = 2;
    var friendDivider = 7;
    var frog = 3.5;
    var frogMultiplay = 10;
    var frogDivider = 3.5;
    var frogAdded = 4;
    var firstBoxer = 78.2;
    var secondBoxer = 82.7;
    var workingHours = 640;
    var workingPerHours = 8;
    var workingAdded = 94;

    Homework_1 homeWork = new Homework_1(dog,cat,paper,firstBoxer,secondBoxer);

    IO.println(1);
    homeWork.PrintFirstTask();
    IO.println();

    IO.println(2);
    homeWork.PrintSecondTask(animalsAdded);
    IO.println();

    IO.println(3);
    homeWork.PrintThirdTask(dogDivider,catDivider,paperDivider);
    IO.println();

    IO.println(4);
    homeWork.SetFriend(friend);
    homeWork.PrintFourthTask(friendAdded,friendDivider);
    IO.println();

    IO.println(5);
    homeWork.SetFrog(frog);
    homeWork.PrintFifthTask(frogMultiplay,frogDivider,frogAdded);
    IO.println();

    IO.println(6);
    homeWork.PrintSixthTask();
    IO.println();

    IO.println(7);
    homeWork.PrintSeventhTask();
    IO.println();

    IO.println(8);
    homeWork.PrintEighthTask(workingHours,workingPerHours,workingAdded);
}