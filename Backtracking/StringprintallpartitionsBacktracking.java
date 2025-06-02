package Backtracking;
 import java.util.*;
public class StringprintallpartitionsBacktracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        HashSet<String> dict = new HashSet<>();
        for (int i = 0; i < n; i++) {
            dict.add(sc.next());
        }

        List<String> path = new ArrayList<>();
        backtrack(s, 0, dict, path);
    }

    public static void backtrack(String s, int start, HashSet<String> dict, List<String> path) {
        if (start == s.length()) {
            System.out.println(String.join(" ", path));
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String sub = s.substring(start, end);
            if (dict.contains(sub)) {
                path.add(sub);
                backtrack(s, end, dict, path);
                path.remove(path.size() - 1);
            }
        }
    }
}
//This is a key part of backtracking — you try one option, explore deeper, 
//then when done, remove that option and try next possible options if any exist.
