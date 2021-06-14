package BinaryTree;

import java.nio.file.Path;
import java.util.*;

public class binarytree {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean NodeToRootPath(TreeNode root, TreeNode node, ArrayList<TreeNode> Path) {
        if (root == null)
            return false;

        if (root == node) {
            Path.add(root);
            return true;
        }

        boolean left = NodeToRootPath(root.left, node, Path);
        if (left) {
            Path.add(root);
            return true;
        }

        boolean right = NodeToRootPath(root.right, node, Path);
        if (right) {
            Path.add(root);
            return true;
        }

        return false;
    }

    public static void PrintKDistAway(TreeNode root, int k) {
        if (k < 0 || root == null)
            return;
        if (k == 0) {
            System.out.print(root.val + " ");
        }

        PrintKDistAway(root.left, k - 1);
        PrintKDistAway(root.right, k - 1);
    }
}
