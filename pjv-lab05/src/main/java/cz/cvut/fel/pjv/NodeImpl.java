package cz.cvut.fel.pjv;

public class NodeImpl implements Node{
    private int value;
    private Node leftNode ;
    private Node rightNode ;

    public NodeImpl(int value, Node leftNode, Node rightNode) {
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

//    public void setLeftNode(Node leftNode) {
//        this.leftNode = leftNode;
//    }
//
//    public void setRightNode(Node rightNode) {
//        this.rightNode = rightNode;
//    }



    @Override
    public Node getLeft() {
        if (leftNode == null) {
            return null;
        }
        return leftNode;
    }

    @Override
    public Node getRight() {
        if (rightNode == null) {
            return null;
        }
        return rightNode;
    }

    @Override
    public int getValue() {
        return value;
    }

}
