import java.util.*;

public class DiagonalSum {

    public static void findDiagonalSum(int arr[][]){
        
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            if(i != arr.length-1-i) {
                sum += arr[i][arr.length-1-i];
            }
        }
        System.out.println("\nSUM: "+sum);
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

        findDiagonalSum(arr);

    }
}
