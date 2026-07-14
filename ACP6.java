import java.util.Scanner;

class InvalidChoiceException extends Exception {
    InvalidChoiceException(String message) {
        super(message);
    }
}

class LowBalanceException extends Exception {
    LowBalanceException(String message) {
        super(message);
    }
}

public class ACP6 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("State Bank of India");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            if(choice < 1 || choice > 3) {
                throw new InvalidChoiceException("Invalid Menu Choice.");
            }

            System.out.print("Enter Opening Balance : ");
            double balance = sc.nextDouble();

            if(balance < 1000) {
                throw new LowBalanceException("Minimum Opening Balance should be Rs.1000.");
            }

            System.out.println("Account Created Successfully.");
            System.out.println("Current Balance : " + balance);

        }

        catch(InvalidChoiceException e) {
            System.out.println(e.getMessage());
        }

        catch(LowBalanceException e) {
            System.out.println(e.getMessage());
        }

        catch(Exception e) {
            System.out.println("Invalid Input.");
        }

        finally {
            System.out.println("Thank You for Banking with SBI.");
        }

        sc.close();
    }
}
