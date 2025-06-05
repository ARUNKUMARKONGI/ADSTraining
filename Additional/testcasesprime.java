import java.util.*;
public class testcasesprime {
        
        // Function to check if a number is prime
        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static void printUptoN(int n) {
            for (int i = 1; i <= n; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); 
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int testCases = 3;
            
     
            for (int i = 0; i < testCases; i++) {
                int n = scanner.nextInt();
                printUptoN(n);
            }
            
            scanner.close();
        }
    }
    
