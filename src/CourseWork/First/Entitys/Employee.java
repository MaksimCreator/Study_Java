package CourseWork.First.Entitys;

public class Employee {
    private final String fullName;
    private int department;
    private int salary;

    private final int id;

    public String getFullName() { return fullName; }
    public int getDepartment() { return department; }
    public int getSalary() { return salary; }
    public int getId() { return id; }

    public void setDepartment(int department) { this.department = department; }
    public void setSalary(int salary) { this.salary = salary; }

    public Employee(String fullName,int department,int salary){

        this.fullName = fullName;
        this.department = department;
        this.salary = salary;

        this.id = CounterId.getId();
    }

    @Override
    public boolean equals(Object obj) {

        if((obj instanceof Integer) == false)
            throw new IllegalStateException();

        int salary = (Integer) obj;

        if(salary == this.salary)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {

        printShortInfo();

        IO.print("Department: ");
        IO.println(department);
        IO.print("id: ");
        IO.println(id);

        return "";
    }

    public void printShortInfo(){

        IO.print("Full name: ");
        IO.println(fullName);
        IO.print("Salary: ");
        IO.println(salary);
    }
}
