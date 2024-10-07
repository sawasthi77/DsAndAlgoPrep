package org.example.DSImpl.Tree;

public class DeleteNodeInTree {
    private TreeNode root;
    private TreeNode deleteNode(TreeNode currentNode, int value){
        if(currentNode == null) return null;

        if(value < currentNode.value){
            currentNode.left = deleteNode(currentNode.left, value);
        }
        else if(value > currentNode.value){
            currentNode.right = deleteNode(currentNode.right, value);
        }else{
            if(currentNode.left == null && currentNode.right == null){
                return null;
            }else if(currentNode.left == null){
                currentNode = currentNode.right;
            } else if (currentNode.right == null) {
                currentNode = currentNode.left;
            }else{
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = deleteNode(currentNode.right, subTreeMin);
            }
        }
        return currentNode;
    }

    public void delete(int value){
        deleteNode(root, value);
    }

    public int minValue(TreeNode currentNode){
        while(currentNode.left != null){
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }
}
