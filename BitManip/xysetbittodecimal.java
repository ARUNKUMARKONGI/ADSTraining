package BitManip;
import java.util.*;
public class xysetbittodecimal   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int val1 = (int)Math.pow(2, x);
        int val2 = (int)Math.pow(2, y);
        int result = val1 + val2;
        System.out.println(result);
    }
}


/* import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = (1 << x) | (1 << y);
        System.out.println(result);
    }
}
 */
