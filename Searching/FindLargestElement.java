import java.util.Scanner;

public class FindLargestElement {

    public static int findLargest(int arr[]){
        int max = arr[05];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter SIZE of Array: ");
        int SIZE = sc.nextInt();

        //getting Array Elements
        int arr[] = new int[SIZE];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\nEnter "+ i +" th Element: ");
            arr[i] = sc.nextInt();
        }

        int max = findLargest(arr);
        System.out.println(max+" is Largest");
        
    }
    
}
