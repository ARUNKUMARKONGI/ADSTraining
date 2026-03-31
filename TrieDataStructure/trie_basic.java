import java.util.*;

class trie_node {
    trie_node[] child = new trie_node[26];
    boolean end;
}

public class trie_basic {
    static trie_node root = new trie_node();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++) 
        insert(sc.nextLine());

        int q1 = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<q1;i++){
            System.out.print(search(sc.nextLine())+" ");
        }

        System.out.println();

        int q2 = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<q2;i++){
            System.out.print(prefix(sc.nextLine())+" ");
        }
    }

    static void insert(String s){
        trie_node node = root;
        for(char c : s.toCharArray()){
            int idx = c-'a';
            if(node.child[idx]==null)
             node.child[idx]=new trie_node();
            node=node.child[idx];
        }
        node.end=true;
    }

    static boolean search(String s){
        trie_node node = root;
        for(char c : s.toCharArray()){
            int idx = c-'a';
            if(node.child[idx]==null)
                 return false;
            node=node.child[idx];
        }
        return node.end;
    }

    static boolean prefix(String s){
        trie_node node = root;
        for(char c : s.toCharArray()){
            int idx = c-'a';
            if(node.child[idx]==null)
                 return false;
            node=node.child[idx];
        }
        return true;
    }
}

/* Time

→ Insert: O(L)
→ Search: O(L)
→ Prefix: O(L)

Space

→ O(N * L * 26)




*/

