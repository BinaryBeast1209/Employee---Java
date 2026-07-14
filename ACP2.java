import java.util.Scanner;

class Addition {
    void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }
}

class Subtraction extends Addition {
    void subtract(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }
}

class Multiplication extends Subtraction {
    void multiply(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }
}

class Division extends Multiplication {
    void divide(int a, int b) {
        if (b == 0)
            System.out.println("Division by zero is not possible.");
        else
            System.out.println("Division = " + (a / b));
    }
}

public class ACP2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Division obj = new Division();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter Choice : ");
        int choice = sc.nextInt();

        System.out.print("Enter First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        switch(choice) {

            case 1:
                obj.add(a,b);
                break;

            case 2:
                obj.subtract(a,b);
                break;

            case 3:
                obj.multiply(a,b);
                break;

            case 4:
                obj.divide(a,b);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
