package JavaExercises.Array;
import java.util.*;

public class ReverseArray {

    private static void reverse(int[] arr){
        int i =0, j=arr.length-1;

        while(i<j){
            arr[i] = arr[i]^arr[j];
            arr[j] = arr[i]^arr[j];
            arr[i] = arr[i]^arr[j];
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Elements In Array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        System.out.println("Enter the inputs :");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        reverse(arr);

        System.out.println("Result :");

        for(int num : arr){
            System.out.print(num + " ");
        }
        sc.close();
    }
    
}
