package TrieDataStructure;

import java.util.Scanner;
java.util.*;


class Node {
    Node[] next = new Node[2];
}
public class maxxorof2eleimport {
    public static void insert(Node root, int num) {
        Node node = root;
        for(int i=31; i>=0; i--) {
            int bit = (num >> i) & 1;
            if(node.next[bit] == null)
                node.next[bit] = new Node();
            node = node.next[bit];
        }
    }

    public static int find_max(Node root, int num) {
        Node node = root;
        int max = 0;
        for(int i=31; i>=0; i--) {
            int bit = (num >> i) & 1;
            if(node.next[1 - bit] != null) {
                max |= (1 << i);
                node = node.next[1 - bit];
            } else {
                node = node.next[bit];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();

        Node root = new Node();
        int max = 0;
        insert(root, nums[0]);

        for(int i=1; i<n; i++) {
            max = Math.max(max, find_max(root, nums[i]));
            insert(root, nums[i]);
        }
        System.out.println(max);
    }
}


