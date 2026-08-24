package BitManip;

public class smallestpowerof2greaterthann {
    public static void main(String[] args) {
        int n = 5;
        int power = 1;

        while (power <= n) {
            power *= 2;
        }

        System.out.println(power);
    }
    
}
/* alternative approach using bit manipulation */
// int n = 5;
// int power = 1 << (Integer.toBinaryString(n).length());
/* length of n in binary is 3.. shift 1 left by 3 positions

to calculate number of bits in N we can also using following logic 
while(N > 0) {
    N >>= 1; or n=n/2int power = 1 << (Integer.toBinaryString(n).length());

    bits++;
}
//then shift 1 left by bits positions to get the smallest power of 2 greater than N
1<<bits
*/