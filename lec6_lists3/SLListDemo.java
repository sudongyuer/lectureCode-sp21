package lec6_lists3;

public class SLListDemo<ItemType> {
    private class StuffNode {
        public ItemType item;
        public StuffNode next;

        public StuffNode(ItemType i, StuffNode n) {
            item = i;
            next = n;
        }
    }

    private StuffNode sentinel;

    public int size;

    public void addFirst(ItemType x) {
        size +=1;
        sentinel.next = new StuffNode(x, sentinel.next);
    }

    public void addLast(ItemType x) {
        size +=1;
        StuffNode p = sentinel;

        while (p.next != null) {
            p = p.next;
        }
        p.next = new StuffNode(x, null);
    }

    public SLListDemo(ItemType x){
        sentinel = new StuffNode(x,null);
        size = 1;
    }

    public ItemType getFirst() {
        return sentinel.next.item;
    }

    /**
     * Returns the size of the list using iteration.
     */
//    public int size() {
//        int totalSize = 0;
//        IntNode p = first;
//        while (p != null){
//            totalSize += 1;
//            p = p.next;
//        }
//        return totalSize;
//    }

    /**
     * Returns the size of the list using recursion.
     */
    public int size() {
        return size;
//        return size(first);
    }

//    public int size(IntNode p) {
//        if (p.next == null) {
//            return 1;
//        }
//        p = p.next;
//        return 1 + size(p);
//    }

    public static void main(String[] args) {
        SLListDemo<String> L = new SLListDemo("front");
        L.addFirst("middle");
        L.addFirst("back");
        System.out.println(L.getFirst());
        System.out.println(L.size());
    }
}
