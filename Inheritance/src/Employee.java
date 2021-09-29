public class Employee extends Person {

    int employeeNumber;
    double salary;

    Employee(String name, int yearBorn, int employeeNumber, double salary) {
        super(name, yearBorn);

        this.salary = salary;
    }
    
    Employee(String name, int yearBorn, int employeeNumber) {
        this(name, yearBorn, employeeNumber, 0.0);
    }
}
