import java.awt.*;
import java.text.NumberFormat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scanner.nextInt();

        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 5 == 0) {
            System.out.println("Fizz");
        } else if (num % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }


    }
}

// input "Number"
// if num % 5 = 0 "Fizz"
// if num % 3 = 0 "Buzz
// if num both "FizzBuzz"
// if num none of the above, just print num
