package JavaExercises.Conditional;
import java.util.*;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");

        int n = sc.nextInt();

        String result =  n%2 == 0 ? "Even" : "Odd";

        System.out.println("The number is "+result);
    }
}
