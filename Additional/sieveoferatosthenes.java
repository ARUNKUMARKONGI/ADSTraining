import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        boolean[] prime = new boolean[n + 1];
        
      
        for (int i = 0; i <= n; i++) {
            prime[i] = true;
        }
        // Arrays.fill(prime, true);
        
    
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        
    
        System.out.println("Prime numbers up to " + n + ":");
        for (int p = 2; p <= n; p++) {
            if (prime[p]) {
                System.out.print(p + " ");
            }
        }
        
        scanner.close();
    }
}


// Time Complexity: O(n log log n)

// Space Complexity: O(n)