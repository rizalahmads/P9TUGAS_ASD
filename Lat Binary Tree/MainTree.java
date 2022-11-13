public class MainTree {
    public static void main(String[] args) {
        TNode<Integer> root = BinaryTree.buildTree();
        System.out.println(BinaryTree.height(root));

    }

}
