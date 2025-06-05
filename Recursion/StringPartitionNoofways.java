package Recursion;

import java.util.*;

public class StringPartitionNoofways {

    static int count_ways(String s, Set<String> dict) {
        if(s.length() == 0) return 1;

        int ways = 0;

        for(int i = 1; i <= s.length(); i++) {
            String left = s.substring(0, i);

            if(dict.contains(left)) {
                ways += count_ways(s.substring(i), dict);
            }
        }

        return ways;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();

        Set<String> dict = new HashSet<>();
        for(int i = 0; i < n; i++) {
            dict.add(sc.nextLine());
        }

        int result = count_ways(s, dict);
        System.out.println(result);
    }
}
