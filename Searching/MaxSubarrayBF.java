/* Find Maximum sum of all Subarray elements using BruteForce*/

import java.util.*;

public class MaxSubarrayBF {
    
    public static int maxSubarray(int arr[]){
        int start, end, max=arr[0], sum=0;
        for (int i = 0; i < arr.length; i++) {
            start = i;
            for (int j = 0; j < arr.length; j++) {
                end = j;
                for (int k = start; k <= end; k++) {
                    sum += arr[k];
                }
                if(sum>max)
                   max=sum;
                sum=0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter SIZE of Array: ");
        int SIZE = sc.nextInt();

        int arr[] = new int[SIZE];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\nEnter "+ i +"th Element: ");
            arr[i] = sc.nextInt();
        }
        
        System.out.print("\n\nMaximum Element: "+ maxSubarray(arr));
    }
}
