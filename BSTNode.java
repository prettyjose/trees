package trees;

public class BSTNode {
    private final int data;
    private BSTNode left=null;
    private BSTNode right=null;

    public BSTNode(int data){
        this.data=data;
    }

    public int getData() {
        return data;
    }

    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }
}
