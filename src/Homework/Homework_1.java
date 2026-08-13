package Homework;

public class Homework_1
{
    private final StringBuilder _stringBuilder = new StringBuilder();
    private final Company _company = new Company();

    private final double _firstBoxer;
    private final double _secondBoxer;

    private double _dog;
    private double _cat;
    private double _paper;

    private double _frog;

    private int _friend;

    private String _firstTask;
    private String _secondTask;

    public void SetFriend(int friend) { _friend = friend; }
    public void SetFrog(double frog) { _frog = frog; }

    public Homework_1(double dog,double cat,double paper,double firstBoxer,double secondBoxer)
    {
        _dog = dog;
        _cat = cat;
        _paper = paper;
        _firstBoxer = firstBoxer;
        _secondBoxer = secondBoxer;
    }

    public void PrintFirstTask()
    {
        if(_firstTask == "")
            throw new IllegalStateException();

        if(_firstTask == null)
            _firstTask = BuildAnimals();

        IO.println(_firstTask);
    }

    public void PrintSecondTask(double added)
    {
        _dog += added;
        _cat += added;
        _paper += added;

        _secondTask = BuildAnimals();

        IO.println(_secondTask);
    }

    public void PrintThirdTask(double dogDivider, double catDivider,double paperDivider)
    {
        IO.println(_dog - dogDivider);
        IO.println(_cat - catDivider);
        IO.println(_paper - paperDivider);
    }

    public void PrintFourthTask(int added, int divider)
    {
        IO.println(_friend);
        IO.println(_friend + added);
        IO.println((_friend + added) / divider);
    }

    public void PrintFifthTask(double multiplier, double divide,double added)
    {
        IO.println(_frog);
        IO.println(_frog * multiplier);
        IO.println(_frog * multiplier / divide);
        IO.println(_frog* multiplier / divide + added);
    }

    public void PrintSixthTask()
    {
        IO.println(_firstBoxer + _secondBoxer);        
        
        if(_secondBoxer > _firstBoxer)
            IO.println(_secondBoxer - _firstBoxer);
        else
            IO.println(_firstBoxer - _secondBoxer);
    }

    public void PrintSeventhTask()
    {
        if(_secondBoxer > _firstBoxer)
            IO.println(_secondBoxer % _firstBoxer);
        else
            IO.println(_firstBoxer % _secondBoxer);
    }

    public void PrintEighthTask(int workingHours,int workingPerHours,int addedWorkers)
    {
        _company.SetWorkingHours(workingHours);
        _company.SetWorkingPerHours(workingPerHours);

        _stringBuilder.append("Всего работников в компании — ").append(_company.GetWorkers()).append(" человек");
        IO.println(_stringBuilder.toString());
        _stringBuilder.setLength(0);

        _company.AddWorkers(addedWorkers);

        _stringBuilder.append("Если в компании работает ").append(_company.GetWorkers()).append(" человек, то всего ")
                .append(_company.GetWorkingHours()).append(" часов работы может быть поделено между сотрудниками");

        IO.println(_stringBuilder.toString());
        _stringBuilder.setLength(0);
    }

    private String BuildAnimals()
    {
        String string;

        _stringBuilder.append("dog: ").append(_dog).append(" cat: ").append(_cat).append(" paper: ").append(_paper);
        string = _stringBuilder.toString();
        _stringBuilder.setLength(0);

        return string;
    }

    private class Company
    {
        private int _workingHours = 0;
        private int _workingPerHours = 0;

        public void SetWorkingHours(int hoursWorkedToday) { _workingHours = hoursWorkedToday; }
        public int GetWorkingHours() { return _workingHours; }

        public void SetWorkingPerHours(int workingPerHours) { _workingPerHours = workingPerHours; }

        public int GetWorkers() { return _workingHours / _workingPerHours; }

        public void AddWorkers(int workers)
        {
            if(_workingPerHours == 0)
                throw new IllegalStateException();

            _workingHours += workers * _workingPerHours;
        }
    }
}