package Recursion;
import java.util.*;

public class printvalidparanthesisOptimized {
    
    static ArrayList<String> result = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 != 0) {
            System.out.println("No valid sequences");
            return;
        }
        generate("", 0, 0, n / 2);
        for(String s : result) {
            System.out.println(s);
        }
    }

    static void generate(String current, int open, int close, int max) {
        if(current.length() == max * 2) {
            result.add(current);
            return;
        }
        if(open < max) {
            generate(current + "(", open + 1, close, max);
        }
        if(close < open) {
            generate(current + ")", open, close + 1, max);
        }
    }
}
