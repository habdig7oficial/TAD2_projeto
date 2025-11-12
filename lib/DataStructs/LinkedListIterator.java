package lib.DataStructs;

import java.util.Iterator;

public class LinkedListIterator<Generic> implements Iterator<Generic>{
    Node<Generic> currentNode = null;
    public LinkedListIterator(LinkedList<Generic> list){
        this.currentNode = list.getFirst();
        System.out.println(list.getFirst().getElement());
    }

    @Override
    public boolean hasNext() {
        return currentNode.getNext() != null;
    }

    @Override
    public Generic next() {
        this.currentNode = this.currentNode.getNext();
        return currentNode.getElement();
    }

}
