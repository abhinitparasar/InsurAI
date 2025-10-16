package JavaExercises.Operator;
import java.util.*;

public class Arithmetic {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the a Number :");
        int n = sc.nextInt();

        System.out.print("Enter the a Number :");
        int m = sc.nextInt();

        System.out.println("Addition of Numbers is :" + (n+m));
        System.out.println("Subtraction of NUmbers is :" + (n-m));
        System.out.println("Multiplication of Numbers is :"+ (n*m));
        System.out.println("DIvision of Numbers is :" + (n/m));
        System.out.println("Remainder is :" + (n%m));

        sc.close();
    }
}
