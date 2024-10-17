package Exercise1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        while (true) {
            try {
                System.out.println("Enter an integer: ");
                a = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer");
                scanner.next();
            }
        }
        while (true) {
            try {
                System.out.println("Enter an integer: ");
                b = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer");
                scanner.next();
            }
        }
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        scanner.close();
    }
}


