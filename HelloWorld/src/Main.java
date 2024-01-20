import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int [][] numbers = { { 1, 2, 3}, {4, 5, 6} };
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));
    }
}

