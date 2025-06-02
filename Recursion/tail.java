package Recursion;

public class tail {
    public static void rec(int n)
    {
        if(n==0)
        {
             return;
        }
        rec(n-1);
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        rec(5);
    }    
}
