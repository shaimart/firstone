package cz.cvut.fel.pjv;

public class TestTree {
    public static void main(String[] args) {
        Tree tree = new TreeImpl();
        int[] values = {1,2,3,4,5,6,7,8};
        tree.setTree(values);
        System.out.println(tree.toString());
    }
}
