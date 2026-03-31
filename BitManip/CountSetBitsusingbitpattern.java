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
                //+1 is added to include the number itself if it has the bit set
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
 /* why cyclelength/2?
In the context of counting set bits, the cycle length represents 
the number of integers in a complete cycle of bits for a given position i. 
For each bit position i, there are 2^(i+1) integers in a complete cycle, 
and half of those integers (cycleLength / 2) will have the bit at position i set to 1.
This is because in a complete cycle of 2^(i+1) integers, the bit at position i
will be set to 1 for exactly half of those integers, which is why we
multiply the number of complete cycles by (cycleLength / 2) to get 
the total contribution of set bits for that position.

 trace it for the input n=5:
 give binary value from 1 to 5 with big length 4 only:
Number   Bit3 Bit2 Bit1 Bit0
0          0    0    0    0
1          0    0    0    1
2          0    0    1    0
3          0    0    1    1
4          0    1    0    0
5          0    1    0    1

i=0:
cycleLength = 2^(0+1) = 2
completeCycles = 5 / 2 = 2
total += 2 * (2 / 2) = 2
remainder = 5 % 2 = 1
remainder >= (1 << 0) (1) is true, so total += 1 - 1 + 1 = 1
total = 3
i=1:
cycleLength = 2^(1+1) = 4
completeCycles = 5 / 4 = 1
total += 1 * (4 / 2) = 2
remainder = 5 % 4 = 1
remainder >= (1 << 1) (2) is false, so no additional contribution
total = 5
i=2:
cycleLength = 2^(2+1) = 8
completeCycles = 5 / 8 = 0
total += 0 * (8 / 2) = 0
remainder = 5 % 8 = 5
remainder >= (1 << 2) (4) is true, so total += 5 - 4 + 1 = 2
total = 7
i=3:
cycleLength = 2^(3+1) = 16
completeCycles = 5 / 16 = 0
total += 0 * (16 / 2) = 0
remainder = 5 % 16 = 5
remainder >= (1 << 3) (8) is false, so no additional contribution
total = 7
i=4:
cycleLength = 2^(4+1) = 32
completeCycles = 5 / 32 = 0
total += 0 * (32 / 2) = 0
remainder = 5 % 32 = 5
remainder >= (1 << 4) (16) is false, so no additional contribution
total = 7
The total number of set bits from 1 to 5 is 7, which matches the expected result.
time complexity: O(log n) because we are iterating through the bits of n, which is proportional to log2(n).
space complexity: O(1) because we are using a constant amount of space to store the total count and the loop variable.
 */