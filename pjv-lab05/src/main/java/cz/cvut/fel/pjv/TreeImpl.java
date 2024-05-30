package cz.cvut.fel.pjv;

import java.util.Arrays;

public class TreeImpl implements Tree {
    private Node root;

    @Override
    public void setTree(int[] values) {
        if (values.length > 0) {
            int middle = values.length % 2 == 0 ? values.length / 2 : (values.length - 1) / 2;
            int[] leftSubArr = null;
            if (middle > 0) {
                leftSubArr = Arrays.copyOfRange(values, 0, middle);
            }
            Node leftNode = null;
            if (leftSubArr != null) {
                leftNode = createSubTree(leftSubArr);
            }

            int[] rightSubArr = null;
            if (middle + 1 < values.length) {
                rightSubArr = Arrays.copyOfRange(values, middle + 1, values.length);
            }
            Node rightNode = null;
            if (rightSubArr != null) {
                rightNode = createSubTree(rightSubArr);
            }
            root = new NodeImpl(values[middle], leftNode, rightNode); 
        }
    }

    // helpful fun-t for recursion
    private Node createSubTree(int[] values) {
        if (values.length == 0) {
            return null;
        }
        if (values.length == 1) {
            return new NodeImpl(values[0], null, null);
        }

        int middle = values.length % 2 == 0 ? values.length / 2 : (values.length - 1) / 2;
        int[] leftSubArr = null;
        if (middle > 0) {
            leftSubArr = Arrays.copyOfRange(values, 0, middle);
        }

        int[] rightSubArr = null;
        if (middle + 1 < values.length) {
            rightSubArr = Arrays.copyOfRange(values, middle + 1, values.length);
        }

        Node leftNode = null;
        if (middle > 0) {
            leftNode = createSubTree(leftSubArr);
        }

        Node rightNode = null;
        if (middle + 1 < values.length) {
            rightNode = createSubTree(rightSubArr);
        }

        return new NodeImpl(values[middle], leftNode, rightNode);

    }


    @Override
    public Node getRoot() {
        return root;
    }

    @Override
    public String toString() {
        return printTree(root, 0);
    }

    private String printTree(Node node, int depth) {
        if (node == null) {
            return "";
        }

        String spaces = " ".repeat(depth);
        String result = spaces + "- " + node.getValue() + "\n";


        if (node.getLeft() != null) {
            result += printTree(node.getLeft(), depth + 1);
        }
        if (node.getRight() != null) {
            result += printTree(node.getRight(), depth + 1);
        }

        return result;
    }

}
