package medium;

import medium.model.TreeNode;

public class AddOneRow {
    public static TreeNode addOneRow(TreeNode root, int v, int d) {
        if (root == null) {
            return null;
        }
        if (d == 1) {
            TreeNode node = new TreeNode(v);
            node.left = root;
            return node;
        }
        if (d - 1 == 1 || d == 1) {
            TreeNode temp = root.left;
            root.left = new TreeNode(v);
            root.left.left = temp;
            TreeNode temp1 = root.right;
            root.right = new TreeNode(v);
            root.right.right = temp1;
            return root;
        }
        addOneRow(root.left, v, d - 1);
        addOneRow(root.right, v, d - 1);
        return root;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4);
        TreeNode treeNodel1 = new TreeNode(2);
        treeNode.left = treeNodel1;
//        TreeNode treeNoder1 = new TreeNode(6);
//        treeNode.right = treeNoder1;
        treeNodel1.left = new TreeNode(3);
        treeNodel1.right = new TreeNode(1);
        //  treeNoder1.left = new TreeNode(5);
        printInorder(treeNode);
        System.out.println();
        addOneRow(treeNode, 1, 3);
        printInorder(treeNode);
    }


    static void printInorder(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.val + " ");
        printInorder(node.left);
        printInorder(node.right);
    }

}
