package BitManip;

public class bitunset {
    public static void main(String[] args) {
    
    int n=10;
    int mask= 1<<2; //mask for 3rd bit(0,1,2) 1<<n in general
    // System.out.println(~n);
    System.out.println(~mask);
    n=n&~mask;       //n=n&(~)mask will unset the bit
    System.out.println(n);
}
}

//1010 in binary, 3rd bit is 0, after setting it,
//it becomes 1110 so output is 14
// given an integer num, set the 'nth' bit from the num.
/* Java uses 32-bit two’s complement for signed integers.
-x is implemented as:
~x + 1 Therefore:~x = -x - 1 
So, ~4 = -5, which is 1111 1011 in two’s complement 
(because the most significant bit is 1, indicating a negative number).*/
