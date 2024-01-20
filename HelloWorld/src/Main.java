import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        Arrays.toString(numbers);

        System.out.println(numbers); //numbers needs to be 'dereferenced' or else you will just print an address in memory
        System.out.println(Arrays.toString(numbers)); // this dereferences numbers

    }
}

