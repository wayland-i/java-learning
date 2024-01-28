import java.awt.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String[] fruits = { "Apple", "Mango", "Orange"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

// input "Number"
// if num % 5 = 0 "Fizz"
// if num % 3 = 0 "Buzz
// if num both "FizzBuzz"
// if num none of the above, just print num
