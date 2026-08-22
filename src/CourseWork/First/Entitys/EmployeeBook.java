package CourseWork.First.Entitys;

import java.util.Objects;

public class EmployeeBook {

    private final int addSalary = 1;
    private final int removeSalary = -1;

    private final String firstTaxType = "PROPORTIONAL";
    private final String secondTaxType = "PROGRESSIVE";

    private final Employee[] employees = new Employee[10];

    public boolean tryAddEmployee(Employee employee){

        for(int i = 0; i < employees.length; i++){

            if(employees[i] == null){
                employees[i] = employee;
                return true;
            }
        }

        return false;
    }

    public void printEmployees(){

        for(Employee employee: employees){

            if(employee == null)
                return;

            IO.println();
            employee.toString();
        }
    }

    public int getMiddleSalary(){
        int salary = 0;
        int counter = 0;

        for(Employee employee: employees){

            if(employee == null && salary != 0)
                return salary / counter;
            else if (employee == null)
                return 0;

            counter++;
            salary += employee.getSalary();
        }

        return salary / counter;
    }

    public int[] getTax(String taxType){

        int length = getCountEmployee();
        int[] listTax = new int[length];

        if(Objects.equals(taxType,firstTaxType)){

            for(int i = 0; i < length; i++){
                listTax[i] = employees[i].getSalary() / 100 * 13;
            }

            return listTax;
        }
        else if(Objects.equals(taxType,secondTaxType)){

            for(int i = 0; i < length; i++){

                int salaryEmployee = employees[i].getSalary();

                if(salaryEmployee <= 150)
                    listTax[i] = salaryEmployee / 100 * 13;
                else if(salaryEmployee <= 350)
                    listTax[i] = salaryEmployee / 100 * 17;
                else
                    listTax[i] = salaryEmployee / 100 * 21;
            }

            return listTax;
        }

        throw new IllegalStateException();
    }

    public void updateSalary(int departmentUpdate, int percent) {

        if(percent == 0)
            throw new IllegalStateException();

        int department;
        int length = getCountEmployee();

        for(int i = 0; i < length;i++){

            department = employees[i].getDepartment();

            if(department != departmentUpdate)
                continue;

            int salary = employees[i].getSalary();
            int newSalary = salary + salary / 100 * percent;

            switch(department){
                case 1,2,3,4,5:
                    employees[i].setSalary(newSalary);
                    break;
                default:
                    IO.println(department);
                    throw new IllegalStateException();
            }
        }
    }

    public void printEmployeeMinSalary(int wage, int employeeNumber){

        int currentSalary;
        int counter = 0;
        int index = 0;
        int length = getCountEmployee();

        if(employeeNumber < 0 || employeeNumber == 0)
            throw new IllegalStateException();

        if(employeeNumber >= length)
            throw new IllegalStateException();

        while(index < length){

            currentSalary = employees[index].getSalary();

            if(currentSalary >= wage)
            {
                index++;
                continue;
            }

            employees[index].printShortInfo();
            IO.println();

            counter++;
            index++;

            if(counter == employeeNumber)
                break;
        }
    }

    public boolean isEmployeeSalary(int salary){

        int length = getCountEmployee();

        for(int i = 0; i < length; i++){

            if(employees[i].equals(salary))
                return true;
        }

        return false;
    }

    public void printEmployeeBigSalary(int department, int bigSalary){

        int currentDepartment;
        int currentSalary;
        int length = getCountEmployee();

        for(int i = 0; i < length;i++){

            currentDepartment = employees[i].getDepartment();
            currentSalary = employees[i].getSalary();

            if(currentDepartment != department || currentSalary <= bigSalary)
                continue;

            IO.print("Порядковый индекс: ");
            IO.println(i);
            employees[i].printShortInfo();
            break;
        }
    }

    public Employee getEmployeeToId(int id){

        int length = getCountEmployee();

        for(int i = 0; i < length; i++){
            if(employees[i].getId() == id)
                return employees[i];
        }

        return null;
    }

    private int getCountEmployee(){

        int counter = 0;

        for(int i = 0; i < employees.length; i++){
            if(employees[i] == null)
                break;

            counter++;
        }

        return counter;
    }

    private Employee getEmployee(int index){

        if(index >= employees.length)
            throw new IllegalStateException();

        return employees[index];
    }
}