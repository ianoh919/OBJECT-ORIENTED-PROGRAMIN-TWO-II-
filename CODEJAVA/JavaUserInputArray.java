package CODEJAVA.javauserinputarray;

import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a) Take 15 values as inputs and store in an array
        int[] userArray = new int[15];
        System.out.println("Enter 15 integer values:");
        for (int i = 0; i < 15; i++) {
            userArray[i] = scanner.nextInt();
        }

        // b) Check if a number is present in the array
        System.out.println("Enter a number to check:");
        int searchNumber = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] == searchNumber) {
                System.out.println("The number found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in this array.");
        }

        // c) Create a new array in reverse order
        int[] reversedArray = new int[15];
        for (int i = 0; i < userArray.length; i++) {
            reversedArray[i] = userArray[userArray.length - 1 - i];
        }

        // Print elements of the new array
        System.out.println("Elements of the new array in reverse order:");
        for (int value : reversedArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        // d) Sum and product of array elements
        int sum = 0;
        long product = 1;
        for (int value : userArray) {
            sum += value;
            product *= value;
        }

        // Print sum and product
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Product of array elements: " + product);

        scanner.close();
    }
}
