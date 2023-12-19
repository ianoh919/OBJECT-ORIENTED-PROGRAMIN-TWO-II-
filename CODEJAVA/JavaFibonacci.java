package CODEJAVA.javafibonacci;

// Fibonacci.java
public class Fibonacci {
    public static void main(String[] args) {
        int limit = 4000000;
        int sum = 0;
        int prev = 1;
        int current = 2;

        while (current <= limit) {
            if (current % 2 == 0) {
                sum += current;
            }

            int next = prev + current;
            prev = current;
            current = next;
        }

        System.out.println("Sum of even-valued terms in Fibonacci sequence: " + sum);
    }
}

