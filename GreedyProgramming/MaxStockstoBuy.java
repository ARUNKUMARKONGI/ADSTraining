import java.util.*;

class StockDay {
    int price;
    int day;
    StockDay(int price, int day) {
        this.price = price;
        this.day = day;
    }
}

public class MaxStockstoBuy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        StockDay[] stocks = new StockDay[n];
        for (int i = 0; i < n; i++) {
            stocks[i] = new StockDay(sc.nextInt(), i + 1);
        }

        Arrays.sort(stocks, Comparator.comparingInt(s -> s.price));

        int total_stocks = 0;
        for (StockDay s : stocks) {
            int can_buy = Math.min(s.day, k / s.price);
            total_stocks += can_buy;
            k -= can_buy * s.price;
            if (k == 0) break;
        }

        System.out.println(total_stocks);
    }
}
/* s.day restricts max stocks per day
k / s.price restricts max stocks affordable

So buying min of both respects both rules perfectly.

 */