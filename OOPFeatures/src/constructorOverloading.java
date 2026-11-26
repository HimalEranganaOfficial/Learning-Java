public class constructorOverloading {
    
}
public class Employee {
    int emp_id;
    String emp_name;
    double salary;

    public Employee(int id, String name) {
        emp_id = id;
        emp_name = name;
    }
    public Employee(int emp_id, String emp_name, double salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.salary = salary;
    }
    public void display() {
        System.out.println("Employee " + emp_name + " is having id: " + emp_id + " and salary " + salary);
    }
    public static void main(String args[]) {
        Employee emp1 = new Employee(124, " Saman ");
        Employee emp2 = new Employee(422, " Amali ", 57000);
        emp1.display();
        emp2.display();
    }
}