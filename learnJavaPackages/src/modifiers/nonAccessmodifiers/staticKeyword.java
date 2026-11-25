package modifiers.nonAccessmodifiers;

class Student {
    int stu_id; //instance variable
    String stu_name;
    static String college = "ABS"; //static variable
    Student(int stu_id, String stu_name) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
    }
    //method to display the values
    void display() {
        System.out.println(stu_id + " " + stu_name + " " + college);
    }
}
public class staticKeyword {
    public static void main(String args[]) {
        Student s1 = new Student(214, "Amal");
        Student s2 = new Student(345, "Kamal");
        s1.display();
        s2.display();
        //we can change the college of all objects by the single line of code
        Student.college = "NIIS";
        s1.display();
        s2.display();
    }
}