package lib.DataStructs;

public class LinkedList <Generic> {

    private Node<Generic> root = null;
    private Node<Generic> leaf = null;

    private int length = 0; 
    
    public int getLength() {
        return length;
    }

    public void append(Generic element){
        if(root == null){
            root = new Node<Generic>(element);
            leaf = root;
            this.length++;
            return;
        }
        
        Node<Generic> n = new Node<Generic>(element);
        
        if(leaf != null) {
            leaf.next = n;
        }
        leaf = n; 

        this.length++; 
    }

    public void prepend(Generic element){  

        root = new Node<Generic>(element, root);
        if(this.length == 0) {
            this.leaf = root;
        }
        this.length++;
    }

    public Node<Generic> getLast() {
        return this.leaf;
    }

    public Node<Generic> getFirst() {
        return this.root;
    }

    public boolean rmFirst(Generic element) {
        Node<Generic> e = root; 
        Node<Generic> last = null; 
        
        for(int i = 0; i < this.length; i++){ 
            if(e != null && e.element.equals(element)){
                if(last != null) {
                    last.next = e.next;
                } else {
                    this.root = e.next;
                }
                if(e == this.leaf) {
                    this.leaf = last;
                }
                this.length--;
                if(this.length <= 0){
                    this.leaf = null;
                    this.root = null;
                } 
                return true; 
            }
            
            last = e;    
            if (e != null) {
                 e = e.next;
            } else {
                 break; 
            }
        }
        
        return false;
    }

    @Override
    public String toString() {
        String str = "";
        Node<Generic> e = root;
        
        for(int i = 0; i < this.length; i++){
            if (e == null) {
                 throw new IllegalStateException("Node unexpectedly null in toString loop.");
            }
            
            str += "\"" + e.element.toString() + "\" ";
            e = e.next;
        }
        return "[" + str.trim() + "]";
    }

    public String toCleanString() {
        String str = "";
        Node<Generic> e = root;
        
        for(int i = 0; i < this.length; i++){
            if (e == null) {
                 throw new IllegalStateException("Node unexpectedly null in toCleanString loop.");
            }
            str += e.element.toString() + "\n";
            e = e.next;
        }
        return str;
    }
}