import java.awt.*;
import java.text.NumberFormat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner pricipalScan = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = pricipalScan.nextInt();
//        System.out.print(principal);

        Scanner interestScan = new Scanner(System.in);
        System.out.print("Annual Interest Rate: ");
        float interest = interestScan.nextFloat();
//        System.out.print(interest);


        Scanner periodScan = new Scanner(System.in);
        System.out.print("Period (Years): ");
        int period = periodScan.nextInt();
//        System.out.print(period);


        int n = period * 12;
//        System.out.println(n);

        float r = (interest / 100) / 12;

        // now lets break up the equation into smaller pieces
        // int payments = (1 + interest)^n //lets see if we can print this as a float
        // 1 + interest is a float

        float p = principal;

//        System.out.println("r: " + r);
//        System.out.println("n: " + n);

        double parens = Math.pow(((1 + r)), (n));

        double top = r * parens;

        double bottom = parens - 1;
//        System.out.println("parens: " + parens);
//        System.out.println("top: " + top);
//        System.out.println("bottom: " + bottom);

        double mortgage = (p * (top / bottom));

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format( mortgage);

        System.out.println("Mortgage: " + result);
    }
}

