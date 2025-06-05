import java.util.*;

public class StringPartitioningMin {
    
    static int min_partition(String s, Set<String> dict) {
        if(s.length() == 0) return 0;
        
        int min = Integer.MAX_VALUE;
        
        for(int i = 1; i <= s.length(); i++) {
            String left = s.substring(0, i);
            
            if(dict.contains(left)) {
                int right_ans = min_partition(s.substring(i), dict);
                
                if(right_ans != Integer.MAX_VALUE) {
                    min = Math.min(min, 1 + right_ans);
                }
            }
        }
        
        return min;
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
        
        int ans = min_partition(s, dict);
        
        if(ans == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(ans);
    }
}
