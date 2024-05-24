import java.util.Scanner;

public class MainExample {

    public static void main(String[] args) {
        String phrase = "Java is a versatile programming language.";

        // Printing phrase using for loop
        System.out.println("Printing phrase using for loop:");
        for (int i = 0; i < 50; i++) {
            System.out.println((i + 1) + ". " + phrase);
        }

        // Printing phrase using while loop
        System.out.println("\nPrinting phrase using while loop:");
        int j = 0;
        while (j < 50) {
            System.out.println((j + 1) + ". " + phrase);
            j++;
        }

        // Printing hours and minutes using for loop
        System.out.println("\nPrinting hours and minutes using for loop:");
        for (int h = 0; h <= 2; h++) {
            for (int m = 0; m < 60; m++) {
                System.out.printf("%d h %d min%n", h, m);
            }
        }

        // Printing hours and minutes using while loop
        System.out.println("\nPrinting hours and minutes using while loop:");
        int hWhile = 0;
        while (hWhile <= 2) {
            int mWhile = 0;
            while (mWhile < 60) {
                System.out.printf("%d h %d min%n", hWhile, mWhile);
                mWhile++;
            }
            hWhile++;
        }

        // Printing hours, minutes, and seconds using for loop
        System.out.println("\nPrinting hours, minutes, and seconds using for loop:");
        for (int h = 0; h <= 2; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    System.out.printf("%d h %d min %d sec%n", h, m, s);
                }
            }
        }

        // Tabulating a function in a given range
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower limit: ");
        double lowerLimit = scanner.nextDouble();

        System.out.print("Enter the upper limit: ");
        double upperLimit = scanner.nextDouble();

        int countInRange = 0;

        // Using while loop
        System.out.println("\nFunction values using while loop:");
        double x = lowerLimit;
        while (x <= upperLimit) {
            double y = 3 * Math.sin(Math.cbrt(3)) + 0.35 * x - 3.8;
            if (y >= 0 && y <= 10) {
                System.out.printf("f(%f) = %f%n", x, y);
                countInRange++;
            }
            x += 0.1;
        }

        // Using for loop
        System.out.println("\nFunction values using for loop:");
        for (x = lowerLimit; x <= upperLimit; x += 0.1) {
            double y = 3 * Math.sin(Math.cbrt(3)) + 0.35 * x - 3.8;
            if (y >= 0 && y <= 10) {
                System.out.printf("f(%f) = %f%n", x, y);
                countInRange++;
            }
        }