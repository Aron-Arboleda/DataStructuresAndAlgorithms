public class Tree {
    public static void main(String[] args) {
        Node2 root = new Node2(2);
        root.left = new Node2(3);
        root.right = new Node2(4);
        root.right.left = new Node2(12);
        root.left.left = new Node2(5);
        root.left.right = new Node2(6);
        root.left.left.left = new Node2(10);

        System.out.println(find_sum_more_efficient(root));

    }

    public static int find_sum(Node2 root) {
        if (root.left != null && root.right != null) {
            return find_sum(root.left) + find_sum(root.right) + root.data;
        } else if (root.left != null) {
            return find_sum(root.left) + root.data;
        } else if (root.right != null) {
            return find_sum(root.right) + root.data;
        }
        return root.data;
    }

    public static int find_sum_more_efficient(Node2 root) {
        if (root == null){
            return 0;
        }
        return find_sum(root.left) + find_sum(root.right) + root.data;
    }
}

class Node2 {
    int data;
    Node2 left;
    Node2 right;

    Node2(int data) {
        this.data = data;
    }
}
