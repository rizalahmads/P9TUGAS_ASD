public class BinaryTree<E> {
    public static TNode<Integer> buildTree() {
        TNode<Integer> root, node1, node2, node3, node4, node5, node6, node7, node8, node9;

        node1 = new TNode<Integer>(60);
        node2 = new TNode<Integer>(100);
        node3 = new TNode<Integer>(80);
        node4 = new TNode<Integer>(30, node1, null);
        node5 = new TNode<Integer>(20, node4, null);
        node6 = new TNode<Integer>(10, null, node5);
        node7 = new TNode<Integer>(5, null, node6);
        node8 = new TNode<Integer>(70, node2, null);
        node9 = new TNode<Integer>(40, node8, node2);

        root = new TNode<Integer>(50, node9, node7); ;

        return root;
    }

    public static <E> int height(TNode<E> t) {
        int height, leftHeight, rightHeight;

        if (t == null) {
            height = 0;
        } else {
            leftHeight = height(t.left);
            rightHeight = height(t.right);

            if (leftHeight > rightHeight) {
                height = leftHeight + 1;
            } else {
                height = rightHeight + 1;
            }
        }

        return height;
    }
}