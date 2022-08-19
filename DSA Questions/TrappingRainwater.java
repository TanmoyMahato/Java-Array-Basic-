/* 

Given N non-negative integers representing 
an elevation map where the width of each bar is 1 
compute how much water it can trap after raining

*/

import java.util.*;

public class TrappingRainwater {

    public static int compute(int arr[]){
        
          //array with left maximum height
          int leftarr[] = new int[arr.length];
          leftarr[0] = arr[0];
          for (int i = 1; i < arr.length; i++) {
              leftarr[i] = Math.max(leftarr[i-1],arr[i]);            
          }
           //array with right maximum height
          int rightarr[] = new int[arr.length];
          rightarr[arr.length-1] = arr[arr.length-1];
          for (int j = arr.length-2; j >= 0; j--) {
              rightarr[j] = Math.max(rightarr[j+1],arr[j]);
          }

        int min, total = 0;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(leftarr[i], rightarr[i]);
            total += (min - arr[i]);
        }
        return total;
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

        System.out.print("\n\nMax Water Capacity: "+ compute(arr)); 
    }
    
}
