package lib.DataStructs;

public class Node <Generic> { 
    private Generic element; 
    private Node<Generic> next; 

    public Node(Generic element, Node<Generic> next) {
        this.element = element;
        this.next = next;
    }
    
    public Node(Generic element) {
        this(element, null);
    }

    public Generic getElement() {
        return element;
    }
    public void setElement(Generic element) {
        this.element = element;
    }

    public Node<Generic> getNext() {
        return next;
    }

    public void setNext(Node<Generic> next) {
        this.next = next;
    }

}