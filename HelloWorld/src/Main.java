import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        String message = new String("Hello World");
        // This how you always deal with reference types in Java^^^
        String message = "Hello World" + "!!";
//        message.endsWith("!!");
        // But java allows you to do this as a short hand^^, still a reference type though
        System.out.println(message.length());


    }
}

