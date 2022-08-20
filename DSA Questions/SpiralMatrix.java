import java.util.*;

public class SpiralMatrix{

    public static void findSpiralMatrix(int arr[][]){
        int startRow = 0, endRow = arr.length-1;
        int startCol = 0, endCol = arr[0].length-1;
        while (startRow <= endRow && startCol <= endCol) {
            //top
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(arr[startRow][i]+" ");
            }
            //right    
            for (int i = startRow+1; i <= endRow; i++) {
                System.out.print(arr[i][endCol]+" ");
            }
            //bottom    
            for (int i = endCol-1; i >= startCol; i--) {
                if(startRow == endRow){
                  break;
                }  
                System.out.print(arr[endRow][i]+" ");
            }
            //left    
            for (int i = endRow-1; i >= startRow+1; i--) {
                if(startCol == endCol){
                  break;
                }  
                System.out.print(arr[i][startCol]+" ");
            }
    
            startRow++;
            startCol++;
            endRow--;
            endCol--;
            
        }
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

        findSpiralMatrix(arr);

    }


}