package JAVAOOP2.calculategclass;

// ExtendedCalculateG.java
public class ExtendedCalculateG {

    public static double multi(double a, double b) {
        return a * b;
    }

    public static double powerToSquare(double a) {
        return Math.pow(a, 2);
    }

    public static double summation(double a, double b) {
        return a + b;
    }

    public static void outline(double result) {
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        // Example usage of the extended CalculateG class
        double num1 = 5.0;
        double num2 = 3.0;

        double multiplicationResult = multi(num1, num2);
        double squareResult = powerToSquare(num1);
        double sumResult = summation(num1, num2);

        // Printing out the results
        outline(multiplicationResult);
        outline(squareResult);
        outline(sumResult);
    }
}
