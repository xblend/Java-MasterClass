package com.company;

public class MyLinkedList implements NodeList{
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root==null){
            //The list is empty, added item would become the head
            this.root = item;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem!=null){
            int comparison = currentItem.compareTo(item);
            if(comparison<0){
                //item is greater than currentItem
                if(currentItem.next()!=null)
                    currentItem = currentItem.next();
                else {
                    /*
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    */
                    //Shortcut, since setNext method returns the reference of the passed argument
                    //i.e. item in this case
                    currentItem.setNext(item).setPrevious(currentItem);
                    return true;
                }
            }
            else if(comparison>0) {
                //item is lesser than currentItem
                if(currentItem.previous()!=null){
                    /*
                    currentItem.previous().setNext(item);
                    item.setPrevious(currentItem.previous());
                    item.setNext(currentItem);
                    currentItem.setPrevious(item);
                    */
                    //applying shortcut again, Refer to the definition of setPrevious/setNext
                    currentItem.previous().setNext(item).setPrevious(currentItem.previous());
                    item.setNext(currentItem).setPrevious(item);
                }
                else{
                    //You are smart enough to understand now
                    item.setNext(currentItem).setPrevious(item);
                    this.root=item;
                }
                return true;
            }
            else
                break;
            }
        return false;
        }



    @Override
    public boolean removeItem(ListItem item) {
        if(item!=null)
            System.out.println("Deleting item " + item.getValue());
        ListItem currentItem = this.root;
        while(currentItem!=null) {

            //My solution
            if (currentItem.compareTo(item) == 0) {
                if(currentItem.previous()!=null) {
                    if (currentItem.next() != null)
                        currentItem.previous().setNext(currentItem.next()).setPrevious(currentItem.previous());
                    else
                        currentItem.previous().setNext(null);
                }
                else {
                    if (currentItem.next() == null)
                        this.root = null;
                    else {
                        this.root = currentItem.setNext(currentItem.next());
                        this.root.setPrevious(null);
                    }
                }
                return true;
            }
            currentItem=currentItem.next();

/*
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                if (currentItem == this.root){
                    this.root = currentItem.next();}
                else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null){
                        currentItem.next().setPrevious(currentItem.previous());}
                }
                return true;
            }
            else if(comparison<0)
                currentItem=currentItem.next();
            else
                break;
*/
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root==null) {
            System.out.println("The list is empty");
            return;
        }
        while(root!=null) {
            System.out.println(root.getValue());
            root = root.next();
        }
    }
}
