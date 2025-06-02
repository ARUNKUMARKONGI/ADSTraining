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
