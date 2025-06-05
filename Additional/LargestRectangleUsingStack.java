package Additional;
import java.util.*;
public class LargestRectangleUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for(int i = 0; i < n; i++)
            h[i] = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        int max_area = 0;
        int i = 0;

        while(i < n) {
            if(stack.isEmpty() || h[i] >= h[stack.peek()]) {
                stack.push(i++);
            } else {
                int top = stack.pop();
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                int area = h[top] * width;
                max_area = Math.max(max_area, area);
            }
        }

        while(!stack.isEmpty()) {
            int top = stack.pop();
            int width = stack.isEmpty() ? i : i - stack.peek() - 1;
            int area = h[top] * width;
            max_area = Math.max(max_area, area);
        }

        System.out.println(max_area);
    }
}

