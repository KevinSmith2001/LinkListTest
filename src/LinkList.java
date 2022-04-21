public class LinkList {
    private Node head;
    public LinkList(){
        head = null;
    }
    //1.初始化链表
    public void clearList(){
        head = null;
    }
    //2.头部增加节点
    public void addAtHeader(int x){
        Node n = new Node(x);
        n.setNext(head);
        head = n;
    }
    //3.头部删除节点
    public void removeAtHeader(){
        if(head!= null)
            head= head.getNext();
    }
    //4.统计链表节点数量,链表遍历
    public int getCount(){
        Node p = head;
        int count=0;
        while (p!=null){
            count = count +1;
            p=p.getNext();
        }
        return count;
    }

}
