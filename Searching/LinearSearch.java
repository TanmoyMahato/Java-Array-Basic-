import java.util.*;

public class LinearSearch{

    public static int linearSearch(int arr[], int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array SIZE: ");
        int SIZE = sc.nextInt();

        int arr[] = new int[SIZE];
        for(int i=0; i<SIZE; i++){
          System.out.println("Enter "+ i +" th element: ");
          arr[i] = sc.nextInt();
        }

        System.out.print("\n\nEnter element to search: ");
        int element = sc.nextInt();

        int index = linearSearch(arr,element);
        if(index != -1)
          System.out.println(index+" th element");
        else
          System.out.println("\nNOT FOUND");
    }
}