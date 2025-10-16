package JavaExercises.Operator;
import java.util.*;

public class Relational{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int x = sc.nextInt();

        System.out.println("Enter a Number : ");
        int y = sc.nextInt();

        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));

        sc.close();
    }
}