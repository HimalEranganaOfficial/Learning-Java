public class constructorOverloading {
    int emp_id;
    String emp_name;
    double salary;

    public constructorOverloading(int id, String name) {
        emp_id = id;
        emp_name = name;
    }
    public constructorOverloading(int emp_id, String emp_name, double salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.salary = salary;
    }
    public void display() {
        System.out.println("constructorOverloading " + emp_name + " is having id: " + emp_id + " and salary " + salary);
    }
    public static void main(String args[]) {
        constructorOverloading emp1 = new constructorOverloading(124, " Saman ");
        constructorOverloading emp2 = new constructorOverloading(422, " Amali ", 57000);
        emp1.display();
        emp2.display();
    }
}