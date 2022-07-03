package com.company;

public class SearchTree implements NodeList {
    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        int comparator;
        if(this.root==null){
            this.root=item;
            return true;
        }
        ListItem currentItem=this.root;
        while(true){
            comparator= currentItem.compareTo(item);
            if(comparator>0){
                if(currentItem.previous()==null){
                    currentItem.setPrevious(item);
                    return true;
                }
                else
                    currentItem=currentItem.previous();
            }
            else if(comparator<0){
                if(currentItem.next()==null){
                    currentItem.setNext(item);
                    return true;
                }
                else
                    currentItem=currentItem.next();
            }
            else
                return false;
        }
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item==null)
            return false;
        System.out.println("Removing "+ item.getValue());
        int comparator;
        ListItem currentItem = this.root;
        ListItem parent = currentItem;
        while (currentItem!=null){
            comparator = currentItem.compareTo(item);
            if(comparator<0){
                parent=currentItem;
                currentItem=currentItem.next();
            }
            else if(comparator>0){
                parent=currentItem;
                currentItem=currentItem.previous();
            }
            else{
                performRemoval(parent,currentItem);
                return true;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root!=null){
            traverse(root.previous());
            System.out.println("Value= "+root.getValue());
            traverse(root.next());
        }
    }

    private void performRemoval(ListItem parent, ListItem item){
        //if item.next() is null there is no right node so keep bst on left
        if(item.next()==null){
            //if item is on parent's right node
            if(parent.next()==item)
                parent.setNext(item.previous());
            //if item is on parent's left node
            else if(parent.previous()==item)
                parent.setPrevious(item.previous());
            //if item is the parent that means we are looking at root
            else
                this.root=item.previous();
        }
        //if item.previous() is null there is no left node so keep bst on right
        else if(item.previous()==null){
            if(parent.next()==item)
                parent.setNext(item.next());
            else if(parent.previous()==item)
                parent.setPrevious(item.next());
            else
                this.root=item.next();
        }
        else {
            //get the leftmost node from the tree and assign it to the item
            ListItem currentItem = item.next();
            ListItem leftmostNode = item;
            while(currentItem.previous()!=null){
                leftmostNode = currentItem;
                currentItem = currentItem.previous();
            }
            // Now put the smallest value into our node to be deleted
            item.setValue(currentItem.getValue());
            //delete the smallest node
            if(leftmostNode==item)
                currentItem.setNext(currentItem.next());
            else
                leftmostNode.setPrevious(currentItem.next());
        }
    }
}
