package Recursion;
import java.util.*;
public class StringPartitioning{
    public static boolean word_break(String s, Set<String> dict) {
        if (s.length() == 0)
            return true;

        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            if (dict.contains(prefix)) {
                if (word_break(s.substring(i), dict))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        Set<String> dict = new HashSet<>();
        for (int i = 0; i < n; i++) {
            dict.add(sc.nextLine());
        }
        boolean res = word_break(s, dict);
        System.out.println(res);
    }
}

