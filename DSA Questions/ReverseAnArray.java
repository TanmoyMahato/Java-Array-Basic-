/*

 Array: [ 2,4,6,8,10 ]
 Reversed Array: [ 10,8,6,4,2 ]
 
*/

import java.util.*;

public class ReverseAnArray {
    
    public static void reverseArray(int arr[]){
        int lastindex = arr.length-1;
        for (int i = 0; i < (arr.length)/2; i++) {
           arr[i] = arr[i]+arr[lastindex];
           arr[lastindex] = arr[i]-arr[lastindex];
           arr[i] = arr[i]-arr[lastindex];
           lastindex--;
        }

        System.out.print("\nReversed Array: [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
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

        System.out.print("\n\nArray: [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");

        reverseArray(arr);
    }
}
