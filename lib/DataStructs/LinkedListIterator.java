package lib.DataStructs;

import java.util.Iterator;

public class LinkedListIterator<Generic> implements Iterator<Generic>{
    Node<Generic> currentNode = null;
    public LinkedListIterator(LinkedList<Generic> list){
        this.currentNode = list.getFirst();
    }

    @Override
    public boolean hasNext() {
       // return currentNode.getNext() != null;
       return currentNode.getNext() != null;
    }

    @Override
    public Generic next(){
        if (currentNode.getNext() == null)
            return null;

        Generic e = currentNode.getElement();
        this.currentNode = this.currentNode.getNext();

        return e;
    }

}
