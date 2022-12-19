public class SLListDemo {
    private class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode first;

    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    public void addLast(int x) {
        IntNode p = first;

        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    public int getFirst() {
        return first.item;
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
        return size(first);
    }

    public int size(IntNode p) {
        if (p.next == null) {
            return 1;
        }
        p = p.next;
        return 1 + size(p);
    }

    public static void main(String[] args) {
        SLListDemo L = new SLListDemo();
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        System.out.println(L.getFirst());
        System.out.println(L.size());
    }
}
