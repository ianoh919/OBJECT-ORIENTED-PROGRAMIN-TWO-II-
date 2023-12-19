package CODEJAVA.javapalindromecheker;

// PalindromeChecker.java
import javax.swing.JOptionPane;

public class PalindromeChecker {
    public static void main(String[] args) {
        // GUI interface to enter the number
        String input = JOptionPane.showInputDialog("Enter a number:");
        int number = Integer.parseInt(input);

        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            JOptionPane.showMessageDialog(null, number + " is a palindrome.");
        } else {
            JOptionPane.showMessageDialog(null, number + " is not a palindrome.");
        }
    }

    private static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return original == reverse;
    }
}

