package BitManip;
import java.util.Scanner;

public class bitsxandytodec 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); // number of 1s
        int y = sc.nextInt(); // number of 0s

        int ones = (1 << x) - 1;
        int result = ones << y;

        System.out.println("Decimal Representation: " + result);
        System.out.println("Binary: " + Integer.toBinaryString(result));
    }
}

/* Because subtracting 1  (1<<x)-1 
from a power of two flips all lower bits to 1, giving us a nice block of x 1s. */

/* naive
 import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String bin = "";
        for (int i = 0; i < x; i++) bin += "1";
        for (int i = 0; i < y; i++) bin += "0";
        int result = Integer.parseInt(bin, 2);
        System.out.println(result);
    }
}

 */