public class TNode<E> { // TNode
    public E nodeValue;
    public TNode left, right;

    // leaf node
    public TNode(E value) {
        nodeValue = value;
        left = null;
        right = null;
    }

    // parent node
    public TNode(E value, TNode<E> left, TNode<E> right) {
        nodeValue = value;
        this.left = left;
        this.right = right;
    }

}
