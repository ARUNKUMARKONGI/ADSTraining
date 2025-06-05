 import java.util.*;
public class primenumbersuptocount{
    public static boolean primechecker(int n) {
        if(n <= 1)
            return false;
        else {
            for(int i = 2; i <=Math.sqrt(n); i++) {
                if(n % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int i = 1;

        while(count < n) {
            boolean res = primechecker(i);
            if(res) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
}


