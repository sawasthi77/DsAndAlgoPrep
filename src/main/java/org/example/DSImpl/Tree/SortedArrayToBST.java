package org.example.DSImpl.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        // Choose middle element
        int mid = left + (right - left) / 2;

        // Create the current node
        TreeNode node = new TreeNode(nums[mid]);

        // Recursively build the left and right subtrees
        node.left = helper(nums, left, mid - 1);
        node.right = helper(nums, mid + 1, right);

        return node;
    }

    public static void printLevelOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                System.out.print(node.value + " ");
                queue.add(node.left);
                queue.add(node.right);
            } else {
                System.out.print("null ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {-10, -3, 0, 5, 9};
        SortedArrayToBST bst = new SortedArrayToBST();
        BFS bfs = new BFS();
        System.out.println(bfs.BFS(bst.sortedArrayToBST(array)));
    }
}
