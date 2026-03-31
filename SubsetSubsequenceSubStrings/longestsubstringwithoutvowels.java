import java.util.*;
public class longestsubstringwithoutvowels  {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int current_length = 0;
        int max_length = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                current_length = 0;
            } else {
                current_length++;
                if(current_length > max_length){
                    max_length = current_length;
                }
            }
        }
        System.out.println(max_length);
    }
}
//sample test case
// Input: "earthproblem"
// Output: 5
/* Explanation: 
 * The longest substring without vowels is "rthpr" which has a length of 5.
 */