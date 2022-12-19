public class SLListDemo {
    private class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode sentinel;

    public int size;

    public void addFirst(int x) {
        size +=1;
        sentinel.next = new IntNode(x, sentinel.next);
    }

    public void addLast(int x) {
        size +=1;
        IntNode p = sentinel;

        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    public SLListDemo(){
       sentinel = new IntNode(63,null);
       size = 0;
    }

    public int getFirst() {
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
        SLListDemo L = new SLListDemo();
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        System.out.println(L.getFirst());
        System.out.println(L.size());
    }
}
