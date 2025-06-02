import java.util.*;
public class ClimbingStairsRecursion{
    public static int total_ways(int n) {
        if (n == 0 || n == 1)
            return 1;
        return total_ways(n - 1) + total_ways(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(total_ways(n));
    }
}




/* Problem	Base           Sequence Start	              n=8 Result
standard fibanacci      0, 1, 1, 2, 3, 5, 8, 13, 21	       21
Climbing stairs ways	1, 1, 2, 3, 5, 8, 13, 21, 34	    34

n = 0 means you are already at the top, no steps left to climb.

How many ways to climb zero steps?
Exactly one way: do nothing. */