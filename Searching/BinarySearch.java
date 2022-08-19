import java.util.*;

public class BinarySearch {
    
    public static int binarySearch(int arr[], int search){
        
        int start=0, end=arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid]==search){
                return mid;
            }
            if(arr[mid]<search){
                start = mid+1;
            }
            if(arr[mid]>search){
                end = mid-1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter SIZE of array: ");
        int SIZE = sc.nextInt();

        int arr[] = new int[SIZE];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\nEnter "+ i +" th Element: ");
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        System.out.println("\nEnter element to search: ");
        int search = sc.nextInt();
    
        //System.out.print("Element at "+ binarySearch(arr,search));
        
        int index = binarySearch(arr,search);
        if (index != -1) {
            System.out.print("FOUND");           
        } else {
            System.out.print("NOT FOUND");
        }
    }
}
