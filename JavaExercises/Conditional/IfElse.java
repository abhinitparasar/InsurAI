package JavaExercises.Conditional;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");

        int n = sc.nextInt();

        if(n > 0) System.out.println("It is a positive number");
        else if (n < 0 ) System.out.println("It is a negative number");
        else System.out.println("The number is zero");

        sc.close();
    }
}
