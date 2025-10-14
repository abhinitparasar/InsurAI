package JavaExercises.Array;
import java.util.Scanner;
public class LargestInArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Elements In Array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for(int num : arr) {

            if(num > max) max = num;
        }

        System.out.println("The Largest number is : "+ max);
        sc.close();
    }
}