package Additional;
import java.util.*;

public class LargestRectangleHistogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) h[i] = sc.nextInt();
        int max_area = 0;

        for (int i = 0; i < n; i++) {
            int height = h[i];
            int left = i, right = i;

            while (left > 0 && h[left - 1] >= height)
             left--;
            while (right < n - 1 && h[right + 1] >= height)
             right++;

            int width = right - left + 1;
            int area = height * width;
            if (area > max_area) max_area = area;
        }

        System.out.println(max_area);
    }
}

