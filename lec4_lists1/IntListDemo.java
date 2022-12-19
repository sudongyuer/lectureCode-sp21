package lec4_lists1;

public class IntListDemo {
    public int first;
    public IntListDemo rest;

    public IntListDemo(int f, IntListDemo r) {
        first = f;
        rest = r;
    }

    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    public int get(int i){
        if(i == 0){
            return first;
        }
       return rest.get(i-1);
    }

    public static void main(String[] args) {
        IntListDemo L = new IntListDemo(15, null);
        L = new IntListDemo(10, L);
        L = new IntListDemo(5, L);
        System.out.println(L.size());
        System.out.println(L.get(2));
    }
}
