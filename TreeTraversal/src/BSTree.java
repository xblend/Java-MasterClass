import java.util.NoSuchElementException;

public class BSTree<T extends Comparable<? super T>> {
    private TreeNode<T> root;
    private int size;
    public BSTree() {
        this.root = null;
        this.size = 0;
    }
    public T addNode(T data) {
        if(data==null)
            throw new NullPointerException();
        System.out.printf("Traversing path: ");
        this.root = addNodeRecursive(this.root,data);
        return data;
    }

    private TreeNode<T> addNodeRecursive(TreeNode<T> curr, T data){
        if(curr==null){
            curr = new TreeNode<>(data);
            this.size+=1;
            System.out.println(data.toString());
        }
        else if(curr.getData().compareTo(data)>0){
            System.out.printf(curr.getData().toString()+"-left->");
            curr.setLeft(addNodeRecursive(curr.getLeft(),data));
        }
        else if(curr.getData().compareTo(data)<0){
            System.out.printf(curr.getData().toString()+"-right->");
            curr.setRight(addNodeRecursive(curr.getRight(),data));
        }
            return curr;
    }
    public T removeNode(T data) {
        TreeNode<T> dummy = new TreeNode<>(null);
        this.root = removeNodeRecursive(this.root,data,dummy);
        return dummy.getData();
    }
    private TreeNode<T> removeNodeRecursive(TreeNode<T> curr, T data, TreeNode<T> dummy){
        if(data==null)
            throw new NullPointerException();
        else if(curr==null)
            throw new NoSuchElementException();
        else if(curr.getData().compareTo(data)>0){
            curr.setLeft(removeNodeRecursive(curr.getLeft(),data,dummy));
        }
        else if(curr.getData().compareTo(data)<0) {
            curr.setRight(removeNodeRecursive(curr.getRight(), data, dummy));
        }
        else{
            dummy.setData(curr.getData());
            this.size--;
            if(curr.getLeft()==null && curr.getRight()==null)
                return null;
            else if(curr.getLeft()!=null && curr.getRight()==null)
                return curr.getLeft();
            else if(curr.getRight()!=null && curr.getLeft()==null)
                return curr.getRight();
            else{
                TreeNode<T> dummy2 = new TreeNode<>(null);
                curr.setRight(removeSuccessor(curr.getRight(),dummy2));
                curr.setData(dummy2.getData());
            }
        }
        return curr;
    }
    private TreeNode<T> removeSuccessor(TreeNode<T> curr, TreeNode<T> dummy) {
        if(curr.getLeft()==null){
            dummy.setData(curr.getData());
            return curr.getRight();
        }
        curr.setLeft(removeSuccessor(curr.getLeft(),dummy));
        return curr;
    }

    public int getSize() {
        return size;
    }
    public TreeNode<T> getRoot() {
        return root;
    }
}
