public class Node {
    private int v;
    private  Node next;
    public Node(){
        v=0;
        next = null;
    }
    public Node(int v){
        this.v=v;
        next = null;
    }
    public Node(int v,Node next){
        this.v=v;
        this.next = next;
    }
    public void setV(int v){
        this.v = v;
    }
    public int getV(){return v;}
    public void setNext(Node next){
        this.next = next;
    }
    public Node getNext(){return next;}
    public String toString(){
        return "{"+v+"}";
    }
}
