import java.util.Scanner;

class logic {
    int user_input;
    int machine_output;
    logic(int user_input) {
        this.user_input = user_input;
    }
    public int factorial(int user_input) {
        if (user_input <= 1) {
            return 1;
        } else {
            return user_input*factorial(user_input - 1);
        }
    }
}

public class multiplyBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number> ");
        int user_in = scanner.nextInt();
        logic internalLogic = new logic(user_in);
        System.out.println("\nHere is the answer: "+internalLogic.factorial(user_in));
        scanner.close();
    }
}