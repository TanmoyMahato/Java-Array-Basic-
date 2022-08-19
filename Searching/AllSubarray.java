/*
 
Array: [ 2,4,6 ]

output ->
2
2 4
2 4 6

4
4 6

6
 
 */

import java.util.*;

public class AllSubarray {

    public static void printSubarray(int arr[]){
        int start,end;
        for (int i = 0; i < arr.length; i++) {
            start = i;
            for (int j = 0; j < arr.length; j++) {
                end = j;
                for (int k = start; k <= end; k++) {
                   System.out.print(arr[k] +" ");
                }
                System.out.println();
            }
        }
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
        
        System.out.println();
        printSubarray(arr);
    }
}
