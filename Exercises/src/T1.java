public class T1 {

    static int q = 0;
    static final int p = 22;

    int a;

    T1() {
        q += p;
        a = q;
    }

    int res(int b) {
        return a + b;
    }

    public static void main(String[] args) {
        T1 xx = new T1();
        T1 yy = new T1();

        int c = xx.res(3);
        int d = yy.res(4);

        System.out.println(c + d);
    }
}
