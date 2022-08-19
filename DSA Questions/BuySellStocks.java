import java.util.*;

public class BuySellStocks {

    public static int maxProfit(int prices[]){
        int buyPrice = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                profit = Math.max(prices[i]-buyPrice,profit);
            }
            else{
                buyPrice = prices[i];
            }
        }  
        return profit; 
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
        
        int max = maxProfit(arr);
        System.out.println("Maximum Profit: "+ max);
    }
}
