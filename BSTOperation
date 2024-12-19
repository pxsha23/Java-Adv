public class BSTOperation {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
        }
    }

    // 1. Insert method (handle duplicates)
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else if (root.data < val) {
            root.right = insert(root.right, val);
        } else {
            System.out.println("Duplicate value: " + val);
        }
        return root;
    }

    // 2. Delete method
    public static Node delete(Node root, int val) {
        if (root == null) return null;
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            // Case 1: Leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: Single child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            // Case 3: Two children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // 3. Display (traversal)
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // 4. Show depth of the tree
    public static int getDepth(Node root) {
        if (root == null) return 0;
        return Math.max(getDepth(root.left), getDepth(root.right)) + 1;
    }

    // 5. Show parent-child nodes
    public static void showParentChild(Node root) {
        if (root == null) return;
        if (root.left != null) {
            System.out.println("Parent: " + root.data + " -> Left Child: " + root.left.data);
            showParentChild(root.left);
        }
        if (root.right != null) {
            System.out.println("Parent: " + root.data + " -> Right Child: " + root.right.data);
            showParentChild(root.right);
        }
    }

    // 6. Display leaf nodes
    public static void displayLeafNodes(Node root) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        }
        displayLeafNodes(root.left);
        displayLeafNodes(root.right);
    }

    // 7. Create copy of the tree
    public static Node createCopy(Node root) {
        if (root == null) return null;
        Node newNode = new Node(root.data);
        newNode.left = createCopy(root.left);
        newNode.right = createCopy(root.right);
        return newNode;
    }

    // 8. Display mirror image
    public static Node createMirror(Node root) {
        if (root == null) return null;
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);
        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }

    // 9. Show tree level-wise
    public static void showLevelWise(Node root) {
        if (root == null) return;
        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }

    public static void main(String args[]) {
        Node root = null;
        root = insert(root, 8);
        root = insert(root, 5);
        root = insert(root, 3);
        root = insert(root, 6);
        root = insert(root, 10);
        root = insert(root, 11);

        System.out.println("Inorder traversal:");
        inorder(root);
        System.out.println();

        System.out.println("Preorder traversal:");
        preorder(root);
        System.out.println();

        System.out.println("Postorder traversal:");
        postorder(root);
        System.out.println();

        System.out.println("Depth of the tree: " + getDepth(root));

        System.out.println("Parent-child relationships:");
        showParentChild(root);

        System.out.println("Leaf nodes:");
        displayLeafNodes(root);
        System.out.println();

        Node copy = createCopy(root);
        System.out.println("Inorder traversal of the copied tree:");
        inorder(copy);
        System.out.println();

        root = createMirror(root);
        System.out.println("Preorder traversal of the mirrored tree:");
        preorder(root);
        System.out.println();

        System.out.println("Level-wise traversal:");
        showLevelWise(root);
    }
}
