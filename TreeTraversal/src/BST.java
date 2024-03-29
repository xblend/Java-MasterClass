import java.util.NoSuchElementException;

/**
 * Your implementation of a BST.
 */
public class BST<T extends Comparable<? super T>> {

    /*
     * Do not add new instance variables or modify existing ones.
     */
    private BSTNode<T> root;
    private int size;

    /*
     * Do not add a constructor.
     */

    /**
     * Adds the data to the tree.
     *
     * This must be done recursively.
     *
     * The new data should become a leaf in the tree.
     *
     * Traverse the tree to find the appropriate location. If the data is
     * already in the tree, then nothing should be done (the duplicate
     * shouldn't get added, and size should not be incremented).
     *
     * Should be O(log n) for best and average cases and O(n) for worst case.
     *
     * @param data The data to add to the tree.
     * @throws java.lang.IllegalArgumentException If data is null.
     */
    public void add(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if(data==null)
            throw new java.lang.IllegalArgumentException();
        this.root = addRecursive(this.root, data);
    }

    private BSTNode<T> addRecursive(BSTNode<T> bstNode, T data){
        if(bstNode==null){
            bstNode = new BSTNode<>(data);
            this.size++;
        }
        else if(bstNode.getData().compareTo(data)>0){
            bstNode.setLeft(addRecursive(bstNode.getLeft(),data));
        }
        else if(bstNode.getData().compareTo(data)<0){
            bstNode.setRight(addRecursive(bstNode.getRight(),data));
        }
        return bstNode;
    }

    /**
     * Removes and returns the data from the tree matching the given parameter.
     *
     * This must be done recursively.
     *
     * There are 3 cases to consider:
     * 1: The node containing the data is a leaf (no children). In this case,
     * simply remove it.
     * 2: The node containing the data has one child. In this case, simply
     * replace it with its child.
     * 3: The node containing the data has 2 children. Use the SUCCESSOR to
     * replace the data. You should use recursion to find and remove the
     * successor (you will likely need an additional helper method to
     * handle this case efficiently).
     *
     * Do NOT return the same data that was passed in. Return the data that
     * was stored in the tree.
     *
     * Hint: Should you use value equality or reference equality?
     *
     * Must be O(log n) for best and average cases and O(n) for worst case.
     *
     * @param data The data to remove.
     * @return The data that was removed.
     * @throws java.lang.IllegalArgumentException If data is null.
     * @throws java.util.NoSuchElementException   If the data is not in the tree.
     */
    public T remove(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        BSTNode<T> dummy = new BSTNode<>(null);
        this.root = removeRecursive(this.root,dummy,data);
        return dummy.getData();
    }

    private BSTNode<T> removeRecursive(BSTNode<T> bstNode, BSTNode<T> dummy, T data){
        if(data==null)
            throw new IllegalArgumentException();
        else if(bstNode==null)
            throw new NoSuchElementException();
        else if(bstNode.getData().compareTo(data)>0){
            bstNode.setLeft(removeRecursive(bstNode.getLeft(),dummy,data));
        }
        else if(bstNode.getData().compareTo(data)<0){
            bstNode.setRight(removeRecursive(bstNode.getRight(),dummy,data));
        }
        else{
            this.size--;
            dummy.setData(bstNode.getData());
            if(bstNode.getLeft()==null && bstNode.getRight()==null){
                return null;
            }
            else if(bstNode.getLeft()==null && bstNode.getRight()!=null){
                return bstNode.getRight();
            }
            else if(bstNode.getLeft()!=null && bstNode.getRight()==null){
                return bstNode.getLeft();
            }
            else{
                BSTNode<T> dummy2 = new BSTNode<>(null);
                bstNode.setRight(replaceWithSuccessor(bstNode.getRight(),dummy2));
                bstNode.setData(dummy2.getData());
            }
        }
        return bstNode;
    }
    private BSTNode<T> replaceWithSuccessor(BSTNode<T> bstNode, BSTNode<T> dummy) {
        if(bstNode.getLeft()==null){
            dummy.setData(bstNode.getData());
            return bstNode.getRight();
        }
        bstNode.setLeft(replaceWithSuccessor(bstNode.getLeft(),dummy));
        return bstNode;
    }

    /**
     * Returns the root of the tree.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return The root of the tree
     */
    public BSTNode<T> getRoot() {
        // DO NOT MODIFY THIS METHOD!
        return root;
    }

    /**
     * Returns the size of the tree.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return The size of the tree
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }

    public boolean contains(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        BSTNode<T> dummy = new BSTNode<>(null);
        this.root = containsRecursive(this.root,data,dummy);
        return dummy.getData()==null ? false : true;
    }
    private BSTNode<T> containsRecursive(BSTNode<T> node, T data, BSTNode<T> dummy){
        if(node==null)
            return null;
        else if(data.compareTo(node.getData())>0)
            node.setRight(containsRecursive(node.getRight(), data,  dummy));
        else if(data.compareTo(node.getData())<0)
            node.setLeft(containsRecursive(node.getLeft(), data,  dummy));
        else
            dummy.setData(node.getData());
        return node;
    }
    public T get(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        BSTNode<T> dummy = new BSTNode<>(null);
        this.root = getRecursive(this.root,data,dummy);
        if(dummy.getData()==null)
            throw new NoSuchElementException();
        return dummy.getData();
    }
    private BSTNode<T> getRecursive(BSTNode<T> node, T data, BSTNode<T> dummy){
        if(node==null)
            return null;
        else if(data.compareTo(node.getData())>0)
            node.setRight(getRecursive(node.getRight(), data,  dummy));
        else if(data.compareTo(node.getData())<0)
            node.setLeft(getRecursive(node.getLeft(), data,  dummy));
        else
            dummy.setData(node.getData());
        return node;
    }
}