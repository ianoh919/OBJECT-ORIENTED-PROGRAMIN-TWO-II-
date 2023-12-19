package JAVAOOP2.calculategclass;

// CalculateG.java
public class CalculateG {
    public static void main(String[] arguments) {
        double gravity = -9.81;
        double fallingTime = 30;
        double initialVelocity = 0.0;
        double finalVelocity;
        double initialPosition = 0.0;
        double finalPosition;

        // Formulas for position and velocity
        finalPosition = 0.5 * gravity * Math.pow(fallingTime, 2) + initialVelocity * fallingTime + initialPosition;
        finalVelocity = gravity * fallingTime + initialVelocity;

        // Output the result
        System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");
        System.out.println("The object's velocity after " + fallingTime + " seconds is " + finalVelocity + " m/s.");
    }
}

