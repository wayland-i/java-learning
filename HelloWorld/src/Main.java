import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Implicit casting
        // if there is no chance of data loss, implicit type conversion will happen
        // byte > short > int > long
        double x = 1.1;
        double y = x + 2;
        // explicit casting
        String z = "1";
        int a = Integer.parseInt(z) + 2;

        System.out.println(y);
        System.out.println(a);
    }
}

