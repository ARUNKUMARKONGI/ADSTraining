import java.util.*;
public class longestsubstringwithoutrepeatingchar {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0;
        int max_len = 0;

        while(right < s.length()) {
            if(!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                max_len = Math.max(max_len, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        System.out.println(max_len);
    }
}
/*
right-left+1: length of current substring without repeating characters
why +1: because right and left are indices, so to get the length we need to add 1.
right-left just calculates the gap,not elements.

Input:
abcabcbb
Output:
3
Explanation: The longest substring without repeating characters is "abc", which has a length of 3

Input:bbbbb
Output:
1
 */