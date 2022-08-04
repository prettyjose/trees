package trees;

public class BalancedBST {
    public static void main(String[] args) {

        int[] bst_Inorder_Traversal = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        BSTNode root = buildBalancedTreeRecursively(bst_Inorder_Traversal,
                0, bst_Inorder_Traversal.length - 1);

        BST balancedBSTInstance  = new BST();
        balancedBSTInstance.setRoot(root);

        balancedBSTInstance.printPreOrder();
    }

    private static BSTNode buildBalancedTreeRecursively(int[] bst_inorder_traversal, int start, int end) {
        if(start > end){
            return null;
        }
        if(start == end){
            return new BSTNode(bst_inorder_traversal[start]); //Only 1 element is left
        }
        int mid = (start + end) / 2;
        //It's given that n/2th element will be the root node at any point of insertion.
        BSTNode subTreeRootNode = new BSTNode(bst_inorder_traversal[mid]);
        subTreeRootNode.setLeft(buildBalancedTreeRecursively(bst_inorder_traversal, start, mid-1));
        subTreeRootNode.setRight(buildBalancedTreeRecursively(bst_inorder_traversal, mid+1, end));
        return subTreeRootNode;
    }
}
