import java.awt.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));
    }
}

// input "Number"
// if num % 5 = 0 "Fizz"
// if num % 3 = 0 "Buzz
// if num both "FizzBuzz"
// if num none of the above, just print num
