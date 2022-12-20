package lec4_lists1;


import java.util.Arrays;

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /**
     * Return the size of the list using... recursion!
     */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    /**
     * Return the size of the list using no recursion!
     */
    public int iterativeSize() {
        IntList p = this;
        int totalSize = 0;
        while (p != null) {
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }

    /**
     * Returns the ith item of this IntList.
     */
    public int get(int i) {
        if (i == 0) {
            return first;
        }
        return rest.get(i - 1);
    }

    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);
        int[] x = new int[]{1, 2, 3};
        int[] y =x;
        System.arraycopy(x, 1, y, 0, 2);
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
        int num = 1;
        int num1 = 1;
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(num));
        System.out.println(System.identityHashCode(num1));
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
//        System.out.println(x);
//        System.out.println(L.get(100));
    }
}
