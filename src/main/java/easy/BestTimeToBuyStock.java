package easy;
//#121
public class BestTimeToBuyStock {
    public static int maxProfit(int[] prices) {
        int lowestIndex = 0;
        for (int a = 0; a < prices.length; a++) {
            if (prices[a] < prices[lowestIndex]) {
                lowestIndex = a;
            }
        }
        int highestAfterLowest = lowestIndex;
        for (int b = highestAfterLowest; b < prices.length; b++) {
            if (prices[b] > prices[highestAfterLowest]) {
                highestAfterLowest = b;
            }
        }
        return (prices[highestAfterLowest] - prices[lowestIndex]);
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int[] prices2 = new int[]{7,6,4,3,1};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices2));
    }
}
