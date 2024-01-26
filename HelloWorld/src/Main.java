import java.awt.*;
import java.text.NumberFormat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        int temperature = 22;
//        boolean isWarm = temperature > 20 && temperature < 30;

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
//        person is eligible if they either have high income or good credit and they additionally do not have a criminal record

//        System.out.println(isWarm);
        System.out.println(isEligible);
    }
}

