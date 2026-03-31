import java.util.*;
class Node {
    int data;
    Node left, right;
    Node(int item) {
        data = item;
        left = right = null;
    }
}
public class BST {
    public static Node root;

    public static Node insert(Node root, int data) {
        if (root == null) return new Node(data);
        if (data <= root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);
        return root;
    }

    public static int countnodes(Node root) {
        if (root == null) return 0;
        return 1 + countnodes(root.left) + countnodes(root.right);
    }

    public static int heightoftree(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=heightoftree(root.left);
        int rh=heightoftree(root.right);
        return Math.max(lh,rh)+1;
    }

    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.item + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void display()
    {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        Deque<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch, value;
        while (true) {
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    value = sc.nextInt();
                    root = insert(root, value);
                    break;
                case 2:
                    System.out.println("Nodes: " + countnodes(root));
                    break;
                
                case 3:
                    System.out.println("Height: " + heightoftree(root));
                    break;
                case 4:
                    preorder(root);
                    System.out.println();
                    break;
                case 5:
                    postorder(root);
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Level Order Traversal:");
                    display();
                    break;

                case 7:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
