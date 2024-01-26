import java.awt.*;
import java.text.NumberFormat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String role = "moderator";
        if (role == "admin") {
            System.out.println("You're an admin");
        } else if (role == "moderator") {
            System.out.println("You're a moderator");
        } else {
            System.out.println("You're a guest");
        }
    }
}

