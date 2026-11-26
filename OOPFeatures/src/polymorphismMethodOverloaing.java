class Adder {
    int add(int a,int b){return a+b;}
    int add(int a,int b,int c){return a+b+c;}
    double add(int a,double b){return a+b;}
}
public class polymorphismMethodOverloaing{
    public static void main(String[] args) {
        // Overloading by changing number of arguments
        Adder adder = new Adder();
        System.out.println(adder.add(11,11));
        System.out.println(adder.add(11,11,11));
        // Overloading by changing data type of arguments
        System.out.println(adder.add(11,11.5));
    }
}