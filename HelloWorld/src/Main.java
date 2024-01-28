import java.awt.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("quit")) {
                break;
            }
            System.out.println(input);
        }
    }
}

// input "Number"
// if num % 5 = 0 "Fizz"
// if num % 3 = 0 "Buzz
// if num both "FizzBuzz"
// if num none of the above, just print num
