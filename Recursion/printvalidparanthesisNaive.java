package Recursion;

import java.util.*;

public class printvalidparanthesisNaive {
    static ArrayList<String> result = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 != 0) {
            System.out.println("No valid sequences");
            return;
        }
        generate("", n);
        for(String s : result) {
            System.out.println(s);
        }
    }

    static void generate(String current, int n) {
        if(current.length() == n) {
            if(is_valid(current)) {
                result.add(current);
            }
            return;
        }
        generate(current + "(", n);
        generate(current + ")", n);
    }

    static boolean is_valid(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(') {
                count++;
            } else {
                count--;
            }
            if(count < 0) return false;
        }
        return count == 0;
    }
}

