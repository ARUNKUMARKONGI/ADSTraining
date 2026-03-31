package BitManip;

public class CountSetBitsusingbitpattern {

    public static int countSetBits(int n) {
        int total = 0;
        int i = 0;

        while ((1 << i) <= n) {
            int cycleLength = 1 << (i + 1);  // 2^(i+1)
            int completeCycles = n / cycleLength;

            total += completeCycles * (cycleLength >> 1);  // Add full cycle contribution

            int remainder = n % cycleLength;
           
            if (remainder >= (1 << i)) {
                total += remainder - (1 << i) + 1;  // Add remainder contribution
            }

            i++;
        }

        return total;
    }

    public static void main(String[] args) {
        int n = 16;
        int result = countSetBits(n);
        System.out.println("Total set bits from 1 to " + n + ": " + result);
    }
}
