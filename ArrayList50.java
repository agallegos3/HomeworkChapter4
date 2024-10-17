package Exercise2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class ArrayList50{
    public static void main(String[] args){
        ArrayList<Double> list = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 50; i++) {
            list.add((double)random.nextInt());
        }
        System.out.println("The list created is: ");
        System.out.println(list);
        Scanner scanner = new Scanner(System.in);
        int index = -1;
        while (index < 0 || index > 49) {
            try {
                System.out.println("Enter and index(0 - 49): ");
                index = scanner.nextInt();
                if (index >= 0 && index <= 49) {
                    System.out.println("The number at the index you input is: " + list.get(index));
                } else {
                    System.out.println("Invalid input. Please enter a number 0 - 49");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please enter a number from 0 to 49");
                scanner.next();
            }
        }
        scanner.close();
    }
}
