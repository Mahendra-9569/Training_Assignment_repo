package assignment2;

public class cross_pattern {
    static void printPattern(int n) {
        // Upper Part
        for (int i = 0; i < n; i++) {
            // Starting spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            // Inverted pyramid of spaces
            for (int j = 0; j < (2 * n - 2) - 2 * i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Part
        for (int i = 0; i < n - 1; i++) {
            // Spaces
            for (int j = 0; j < (2 * n - 4) - 2 * i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 0; j < i + 2; j++) {
                System.out.print("*");
            }
            // Pyramid of spaces
            for (int j = 0; j < 2 * i + 2; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 0; j < i + 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
        
    }
    
}
