package Recursion;

import java.util.*;

public class balancedparanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(is_valid(str)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }

    static boolean is_valid(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(') {
                count++;
            } else if(ch == ')') {
                count--;
            }
            if(count < 0) {
                return false;
            }
        }
        return count == 0;
    }
}
