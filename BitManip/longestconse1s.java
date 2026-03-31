import java.util.*;
public class longestconse1s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String s=Integer.toBinaryString(n);

        int max=0;
        int count=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                count++;
                if(count>max) max=count;
            }
            else
            {
                count=0;
            }
        }

        System.out.println(max);
    }
}

/* import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int max=0;
        int count=0;

        while(n>0)
        {
            if((n & 1)==1)
            {
                count++;
                if(count>max) max=count;
            }
            else
            {
                count=0;
            }

            n=n>>1;
        }

        System.out.println(max);
    }
}
    
    import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int count=0;

        while(n>0)
        {
            n=n&(n<<1);
            count++;
        }

        System.out.println(count);
    }
} */

/* what is the purpose of N<<1?
        When we perform N & (N << 1), we are essentially checking
         for pairs of consecutive 1s in the binary representation of N.
       
    why it works?
        The reason this works is that when we perform N & (N << 1), 
        we are effectively "shifting" the bits of N to the left by one position and 
        then performing a bitwise AND operation with the original number N. 
        This operation will only keep the bits that are 1 in both N and (N << 1), 
        for example: take number: 7 111 in binary is 
                              0000 0111
        N << 1 is 14 which is 0000 1110 
        N & (N << 1) is:      0000 0110 which is 6 in decimal,
        continue the tracing:
        N is now 6 (0000 0110)
        N << 1 is 12 (0000 1100)
        N & (N << 1) is:      0000 0100 which
        is 4 in decimal,
        continue the tracing:
        N is now 4 (0000 0100)
        N << 1 is 8 (0000 1000)
        N & (N << 1) is:      0000 0000 which is 0 in decimal,
        The number of times we can perform this operation before N becomes 
        0 gives us the length of the longest sequence of consecutive 1s in the original number N.
    
*/