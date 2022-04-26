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
    //5.查找指定节点
    public boolean search(int x) {
        Node p = head;
        while (p != null) {
            if (p.getV() == x)
                break;
            p = p.getNext();
        }
        if(p==null)
            return false;
        else
            return true;
    }
    //6.尾部增加节点
    public void addAtTail(int x){
        Node n= new Node(x);
        Node p = head;
        if(head == null){
            head = n;
            return;
        }
        //末尾节点,next==null
        while (p.getNext()!=null){
            p=p.getNext();
        }
        p.setNext(n);
    }
    //7.删除指定节点X,删除成功返回true,失败返回false
    public boolean remove(int X){
        //查找值为X的节点是否存在,如果存在,记录节点的上一个节点的位置
        Node p = head;
        Node q = null; //当前节点的上一个节点引用
        while(p!=null){
            if(p.getV()==X)
                break;
            q=p;
            p=p.getNext();
        }
        if(p==null){
            //遍历完了所有节点,没有查到X
            return false;
        }else{
            //p就是指向X的节点,q就是p前一个节点
            q.setNext(p.getNext());
            return true;
        }
    }
    //8.按升序插入值为X的节点
    public void insert(int X){
        //查找值为X的节点是否存在,如果存在,记录节点的上一个节点的位置
       Node p = head;
       Node q = null; //当前节点的上一个节点引用
       while (p!=null){
           if(p.getV()>X)
               break;
           q=p;
           p=p.getNext();
       }
       if(p==null){
       }else{

       }
    }
}
