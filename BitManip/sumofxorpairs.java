package BitManip;

class SumOfXorPairs {

    public static int sumOfXorPairs(int[] arr) {
        int n = arr.length;
        int total = 0;

        // Loop through each bit position from 0 to 31
        for (int bit = 0; bit < 32; bit++) {
            int countSet = 0;

            // Count how many numbers have the current bit set
            for (int i = 0; i < n; i++) {
                if (((arr[i] >> bit) & 1) == 1) {
                    countSet++;
                }
            }

            int countUnset = n - countSet;

            // Each (set, unset) pair contributes (1 << bit)(or 2^bit) to total XOR sum
            int pairContribution = countSet * countUnset * (1 << bit);

            total += pairContribution;
        }

        return total;
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 5}; // Example input
        int result = sumOfXorPairs(arr);
        System.out.println("Sum of XOR of all unique pairs: " + result);
    }
}


// Key Observation:

// XOR gives 1 only when bits differ.

// So instead of pairwise XOR:

// We count how many pairs differ at each bit.

// Number   Bit2 Bit1 Bit0
// 7          1    1    1
// 3          0    1    1
// 5          1    0    1
// Step 2 — Count Set / Unset Per Bit
// Bit 0 (LSB)
// Values: 1, 1, 1

// Set = 3
// Unset = 0

// Pairs contributing = 3 × 0 = 0
// Contribution = 0 × 2⁰ = 0

// Bit 1
// Values: 1, 1, 0

// Set = 2
// Unset = 1

// Pairs = 2 × 1 = 2
// Contribution = 2 × 2¹ = 4

// Bit 2
// Values: 1, 0, 1

// Set = 2
// Unset = 1

// Pairs = 2 × 1 = 2
// Contribution = 2 × 2² = 8

// Step 3 — Add Contributions
// Bit0 → 0
// Bit1 → 4
// Bit2 → 8

// Total = 12

