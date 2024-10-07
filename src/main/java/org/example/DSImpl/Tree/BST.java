package org.example.DSImpl.Tree;

public class BST {

    private TreeNode root;
    public void put(int value){
        root = put(root, value);
    }
    private TreeNode put(TreeNode node, int value){
        if(node == null){
            return new TreeNode(value);
        }
        if(value < node.value){
            node.left = put(node.left, value);
        }
        else if(value > node.value){
            node.right = put(node.right, value);
        }
        return node;
    }

    public boolean contains(int value){
        return contains(root, value);
    }

    private boolean contains(TreeNode node, int value){
        if(node == null){
            return false;
        }
        if(value == node.value){
            return true;
        }
        return value < node.value ? contains(node.left, value) : contains(node.right, value);
    }

    public void inOrderTraversal(){
        inOrderTraversal(root);
    }

    private void inOrderTraversal(TreeNode node){
        if(node!=null){
            inOrderTraversal(node.left);
            System.out.println(node.value + " ");
            inOrderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.put(5);
        bst.put(3);
        bst.put(7);
        bst.put(2);
        bst.put(4);
        bst.put(6);
        bst.put(8);

        System.out.println("Contains 4: " + bst.contains(4));
        System.out.println("Contains 9: " + bst.contains(9));

        System.out.println("Inorder Traversal: ");
        bst.inOrderTraversal();
    }
}