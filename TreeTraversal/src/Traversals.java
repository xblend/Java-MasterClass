import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Your implementation of the pre-order, in-order, and post-order
 * traversals of a tree.
 */
public class Traversals<T extends Comparable<? super T>> {

    /**
     * DO NOT ADD ANY GLOBAL VARIABLES!
     */

    /**
     * Given the root of a binary search tree, generate a
     * pre-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     * @return List containing the pre-order traversal of the tree.
     */
    public List<T> preorder(TreeNode<T> root) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        List<T> retList = new ArrayList<>();
        preorderTraversal(retList,root);
        return retList;
    }

    private void preorderTraversal(List<T> list, TreeNode<T> node){
        if(node!=null){
            list.add(node.getData());
            preorderTraversal(list,node.getLeft());
            preorderTraversal(list,node.getRight());
        }
    }

    /**
     * Given the root of a binary search tree, generate an
     * in-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     * @return List containing the in-order traversal of the tree.
     */
    public List<T> inorder(TreeNode<T> root) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        List<T> retList = new ArrayList<>();
        inorderTraversal(retList,root);
        return retList;
    }

    private void inorderTraversal(List<T> list, TreeNode<T> node){
        if(node!=null){
            inorderTraversal(list,node.getLeft());
            list.add(node.getData());
            inorderTraversal(list,node.getRight());
        }
    }

    /**
     * Given the root of a binary search tree, generate a
     * post-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     * @return List containing the post-order traversal of the tree.
     */
    public List<T> postorder(TreeNode<T> root) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        List<T> retList = new ArrayList<>();
        postorderTraversal(retList,root);
        return retList;
    }

    private void postorderTraversal(List<T> list, TreeNode<T> node){
        if(node!=null){
            postorderTraversal(list,node.getLeft());
            postorderTraversal(list,node.getRight());
            list.add(node.getData());
        }
    }
}