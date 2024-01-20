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

        String mortgage = "answer";


        System.out.println("Mortgage: " + mortgage);
    }
}

