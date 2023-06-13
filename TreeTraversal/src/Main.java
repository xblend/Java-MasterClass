public class Main {
    public static void main(String[] args) {
        BSTree<Integer> integerBST = new BSTree<>();
        integerBST.addNode(10);
        integerBST.addNode(5);
        integerBST.addNode(15);
        integerBST.addNode(3);
        integerBST.addNode(7);
        integerBST.addNode(6);
        integerBST.addNode(8);
        integerBST.addNode(1);
        integerBST.addNode(4);
        integerBST.addNode(13);
        integerBST.addNode(20);
        integerBST.addNode(16);
        integerBST.addNode(14);
        integerBST.addNode(12);

        Traversals<Integer> traversals = new Traversals<>();
        System.out.println("Inorder traversal -> " + traversals.inorder(integerBST.getRoot()));
        System.out.println("Preorder traversal -> " + traversals.preorder(integerBST.getRoot()));
        System.out.println("Postorder traversal -> " + traversals.postorder(integerBST.getRoot()));
        System.out.println(integerBST.getSize());

        System.out.println("Data removed is "+integerBST.removeNode(10).toString());
        System.out.println("Inorder traversal -> " + traversals.inorder(integerBST.getRoot()));
        System.out.println("Preorder traversal -> " + traversals.preorder(integerBST.getRoot()));
        System.out.println("Postorder traversal -> " + traversals.postorder(integerBST.getRoot()));
        System.out.println(integerBST.getSize());

        System.out.println("*****************************************");

        BST<Integer> integerBSTree = new BST<>();
        integerBSTree.add(10);
        integerBSTree.add(5);
        integerBSTree.add(15);
        integerBSTree.add(3);
        integerBSTree.add(7);
        integerBSTree.add(6);
        integerBSTree.add(8);
        integerBSTree.add(1);
        integerBSTree.add(4);
        integerBSTree.add(13);
        integerBSTree.add(20);
        integerBSTree.add(16);
        integerBSTree.add(14);
        integerBSTree.add(12);

        BSTTraversals<Integer> bstTraversals = new BSTTraversals<>();
        System.out.println("Inorder traversal -> " + bstTraversals.inorder(integerBSTree.getRoot()));
        System.out.println("Preorder traversal -> " + bstTraversals.preorder(integerBSTree.getRoot()));
        System.out.println("Postorder traversal -> " + bstTraversals.postorder(integerBSTree.getRoot()));
        System.out.println(integerBSTree.size());

        System.out.println("Data removed is "+integerBSTree.remove(10).toString());
        System.out.println("Inorder traversal -> " + bstTraversals.inorder(integerBSTree.getRoot()));
        System.out.println("Preorder traversal -> " + bstTraversals.preorder(integerBSTree.getRoot()));
        System.out.println("Postorder traversal -> " + bstTraversals.postorder(integerBSTree.getRoot()));
        System.out.println(integerBSTree.size());
        //System.out.println("Data removed is "+integerBSTree.remove(10).toString());

        System.out.println(integerBSTree.get(20));





    }
}