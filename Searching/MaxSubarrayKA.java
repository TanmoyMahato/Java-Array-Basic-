import java.util.*;;

public class MaxSubarrayKA {

    public static int kadanesAlgo(int arr[]){
        
        int max = arr[0], sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum < 0)
               sum=0;
            max = Math.max(sum,max);
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
        
        System.out.print("\n\nMaximum Element: "+ kadanesAlgo(arr));
    }
}
