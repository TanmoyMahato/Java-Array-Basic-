import java.util.*;

public class SelectionSort {
    
    public static void sort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            arr[minPos] = arr[minPos] + arr[i];
            arr[i] = arr[minPos] - arr[i];
            arr[minPos] = arr[minPos] - arr[i];
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
        
        sort(arr);
    }
}
