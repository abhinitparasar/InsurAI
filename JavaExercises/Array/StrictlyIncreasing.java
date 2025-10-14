package JavaExercises.Array;
import java.util.*;

public class StrictlyIncreasing {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Elements In Array");
        int n = sc.nextInt();

        System.out.println("Enter the Inputs :");
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;

        for(int i=1; i<arr.length; i++){
            if(arr[i-1] > arr[i] ){
                isSorted = false;
                break;
            }
        }

        if(isSorted) System.out.println("Array is sorted");
        else System.out.println("Array is not sorted");

        sc.close();
    }
}
