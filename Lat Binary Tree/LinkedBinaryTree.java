/** Conrete implementation of a binary tree using a node-base, linked structure */
public class LinkedBinaryTree<E> extends AbstractBinaryTree<E> {
    // ---------------- nested Node class ----------------
    protected static class Node<E> implements Position<E> {
        private E element; // an element stored at this node
        private Node<E> parent; // a reference to the parent node (if any)
        private Node<E> left; // a reference to the left child (if any)
        private Node<E> right; // a reference to the right child (if any)
        public Node(E e, Node<E> above, Node<E> leftChild, Node<E> rightChild) {
            element = e;
            parent = above;
            left = leftChild;
            right = rightChild;
        }
        // accessor methods
        public E getElement() throws IllegalStateException {
            if (parent == null) // convention for defunct node
                throw new IllegalStateException("Position no longer valid");
            return element;
        }
        public Node<E> getParent() { return parent; }
        public Node<E> getLeft() { return left; }
        public Node<E> getRight() { return right; }
        // update methods
        public void setElement(E e) { element = e; }
        public void setParent(Node<E> parentNode) { parent = parentNode; }
        public void setLeft(Node<E> leftChild) { left = leftChild; }
        public void setRight(Node<E> rightChild) { right = rightChild; }
    } // ----------- end of nested Node class -----------

    /** Factory function to create a new node storing element e. */
    protected Node<E> createNode(E e, Node<E> parent, Node<E> left, Node<E> right) {
        return new Node<E>(e, parent, left, right);
    }

    // LinkedBinaryTree instance variables
    protected Node<E> root = null; // root of the tree
    private int size = 0; // number of nodes in the tree

    // constructor
    public LinkedBinaryTree() {
    } // constructs an empty binary tree
    
    // nonpublic utility
    /** Validates the position and returns it as a node. */
    protected Node<E> validate(Position<E> p) throws IllegalArgumentException {
        if (!(p instanceof Node))
            throw new IllegalArgumentException("Not valid position type");
        Node<E> node = (Node<E>) p; // safe cast
        if (node.getParent() == node) // our convention for defunct node
            throw new IllegalArgumentException("p is no longer in the tree");
        return node;
    }

    // accessor methods (not already implemented in AbstractBinaryTree)
    /** Returns the number of nodes in the tree. */
    public int size() {
        return size;
    }
    
    /** Returns the root Position of the tree (or null if tree is empty). */
    public Position<E> root() {
        return root;
    }

    /** Returns the Position of p's parent (or null if p is root). */
    public Position<E> parent(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return node.getParent();
    }

    /** Returns the Position of p's left child (or null if no child exists). */
    public Position<E> left(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return node.getLeft();
    }

    /** Returns the Position of p's right child (or null if no child exists). */

}