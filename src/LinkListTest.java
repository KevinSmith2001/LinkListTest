public class LinkListTest {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        for(int i=0;i<100;i++)
            list.addAtHeader(i);
        list.removeAtHeader();
        System.out.println("search(99) is"+list.search(99));
        System.out.println("list count="+list.getCount());
    }
}
