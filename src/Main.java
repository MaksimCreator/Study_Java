import CourseWork.First.Entitys.Employee;
import CourseWork.First.Entitys.EmployeeBook;

void main(String[] args)
{
    final String firstTaxType = "PROPORTIONAL";
    final String secondTaxType = "PROGRESSIVE";

    final Employee employee1 = new Employee("Boris Borisov Borisovich",1,135);
    final Employee employee2 = new Employee("Kiril Borisov Borisovich",1,280);
    final Employee employee3 = new Employee("Maksim Borisov Borisovich",1,440);
    final Employee employee4 = new Employee("Ivan Borisov Borisovich",2,120);
    final Employee employee5 = new Employee("Egor Borisov Borisovich",2,265);
    final Employee employee6 = new Employee("Anton Borisov Borisovich",2,425);
    final Employee employee7 = new Employee("Vadim Borisov Borisovich",3,100);
    final Employee employee8 = new Employee("Nikita Borisov Borisovich",3,310);
    final Employee employee9 = new Employee("Evgeniy Borisov Borisovich",4,400);
    final Employee employee10 = new Employee("Matvey Borisov Borisovich",5,260);
    final Employee employee11 = new Employee("Vlad Borisov Borisovich",5,440);

    final EmployeeBook employeeBook = new EmployeeBook();

    IO.println(employeeBook.tryAddEmployee(employee1));
    IO.println(employeeBook.tryAddEmployee(employee2));
    IO.println(employeeBook.tryAddEmployee(employee3));
    IO.println(employeeBook.tryAddEmployee(employee4));
    IO.println(employeeBook.tryAddEmployee(employee5));
    IO.println(employeeBook.tryAddEmployee(employee6));
    IO.println(employeeBook.tryAddEmployee(employee7));
    IO.println(employeeBook.tryAddEmployee(employee8));
    IO.println(employeeBook.tryAddEmployee(employee9));
    IO.println(employeeBook.tryAddEmployee(employee10));
    IO.println(employeeBook.tryAddEmployee(employee11));

    IO.println("_______________________________________________");

    employeeBook.printEmployees();

    IO.println("_______________________________________________");

    IO.print("Средняя зарплата: ");
    IO.println(employeeBook.getMiddleSalary());

    IO.println("_______________________________________________");

    int[] tax = employeeBook.getTax(firstTaxType);

    for(int i = 0; i < tax.length;i++){
        IO.print("Налоги1: ");
        IO.println(tax[i]);
    }

    IO.println();
    tax = employeeBook.getTax(secondTaxType);

    for(int i = 0; i < tax.length;i++){
        IO.print("Налоги2: ");
        IO.println(tax[i]);
    }

    IO.println("_______________________________________________");

    employeeBook.updateSalary(2,20);
    employeeBook.printEmployees();

    IO.println("_______________________________________________");

    employeeBook.printEmployeeBigSalary(2,270);

    IO.println("_______________________________________________");

    employeeBook.printEmployeeMinSalary(140,2);

    IO.println("_______________________________________________");

    IO.println(employeeBook.isEmployeeSalary(260));
    IO.println(employeeBook.isEmployeeSalary(125));

    IO.println("_______________________________________________");

    employeeBook.getEmployeeToId(5).toString();
}