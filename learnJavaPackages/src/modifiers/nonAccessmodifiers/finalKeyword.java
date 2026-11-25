package modifiers.nonAccessmodifiers;

public class finalKeyword {
    final int speedlimit = 90; //final variable  
    public static void main(String args[]) {
        finalKeyword new_car = new finalKeyword();
        new_car.speedlimit = 100;
    }
}

// This code will give an error because we cannot change the value of final variable speedlimit.