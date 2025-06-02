import java.util.*;

class node {
    node[] child = new node[2];
}

class maxsubarrayxor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
        arr[i] = sc.nextInt();

        node root = new node();
        insert(root, 0);

        int max = 0, xor = 0;

        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
            insert(root, xor);
            int best = query(root, xor);
            max = Math.max(max, best);
        }

        System.out.println(max);
    }

    static void insert(node root, int val) {
        node curr = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (val >> i) & 1;
            if (curr.child[bit] == null) 
            {
            curr.child[bit] = new node();
            }
            curr = curr.child[bit];
        }
    }

    static int query(node root, int val) {
        node curr = root;
        int xor = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (val >> i) & 1;
            int opp = 1 - bit;
            if (curr.child[opp] != null) {
                xor |= (1 << i);
                curr = curr.child[opp];
            } else {
                curr = curr.child[bit];
            }
        }
        return xor;
    }
}
