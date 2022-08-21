import java.util.*;

public class SearchInSortedMatrix {

    public static int search(int arr[][],int key){
        
        int i=0, j=arr[0].length-1, found=0;
        while (found != 1) {
            if (key == arr[i][j]) {
                found = 1;
            } 
            else if(key > arr[i][j]) {
                i++;
            }
            else{
                j--;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter no. of ROWs: ");
        int ROW = sc.nextInt();
        System.out.print("Enter no. of COLOUMNs: ");
        int COL = sc.nextInt();

        int[][] arr = new int[ROW][COL];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.print("Enter "+ i +","+ j +":");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEnter element to search: ");
        int key = sc.nextInt();

        System.out.println(search(arr, key));

    }
    
}
