public class LinkList {
    private Node head;
    public LinkList(){
        head = null;
    }
    public void clearList(){
        head = null;
    }
    public void addAtHeader(int x){
        Node n = new Node(x);
        n.setNext(head);
        head = n;
    }
}
