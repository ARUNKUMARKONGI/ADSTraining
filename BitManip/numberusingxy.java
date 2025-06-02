package BitManip;

import java.util.*;

public class numberusingxy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = (1 << x) | (1 << y);
        System.out.println(result);
    }
}
/*
x=2, y=5
1 << x = 1 << 2 = 4      → binary: 00000100
1 << y = 1 << 5 = 32     → binary: 00100000
result = 4 | 32 = 36     → binary: 00100100

OR operator: It ensures multiple bits can be set in a single number
 without affecting others.*/