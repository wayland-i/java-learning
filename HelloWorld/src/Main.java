import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        // declare constant vars up top that way your equations don't have random numbers

        Scanner scanner = new Scanner(System.in);
        // you can use scanner like this to DRY
        // saving inputs to variables
        // getting simple new variables in same code section where you are getting input, well-designed

        int principal;
        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000) {
                break;
            } else {
                System.out.println("Enter a number between 1,000 and 1,000,000.");
            }
        }

        float annualInterest;
        float monthlyInterest;
        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();
            if (annualInterest > 0 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            } else {
                System.out.println("Enter a value greater than 0 and less than or equal to 30.");
            }
        }


        byte years;
        int numberOfPayments;
        while (true) {
            System.out.print("Period (Years): ");
            years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            } else {
                System.out.println("Enter a vlaue between 1 and 30.");
            }
        }


        // entire equation handled here
        // I would need to check everything with a calc before I got it this refactored
        // too much debugging if something goes wrong PEMDAS wise
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        // Right to Left:
        // The NumberFormat Class is called
        // a getCurrencyInstance is created
        // a method ".format()" can then be called on that instance
        // the result is converted to a String
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}

