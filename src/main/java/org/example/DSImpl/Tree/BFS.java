package org.example.DSImpl.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    private TreeNode root;

    public ArrayList<Integer> BFS(TreeNode root) {
        ArrayList<Integer> treeValues = new ArrayList<>();
        TreeNode currentNode = root;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(currentNode);

        while (!queue.isEmpty()) {
            currentNode = queue.remove();
            treeValues.add(currentNode.value);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return treeValues;
    }
}
