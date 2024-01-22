import java.awt.*;
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


        System.out.print("Principal: ");
        int principal = scanner.nextInt();
//        System.out.print(principal);

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
//        System.out.print(interest);


        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;
//        System.out.print(years);


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

