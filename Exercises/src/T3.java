public class T3 {
    int num;
    String dep;
    String arv;

    T3(int fnum, String arvloc) {
        this(fnum, "DFW", arvloc);
    }

    T3(int fnum, String deploc, String arvloc) {
        num = fnum;
        dep = deploc;
        arv = arvloc;
    }

    void output() {
        System.out.println("Flight " + num + ": departing " + dep + ", arriving " + arv);
    }

    public static void main(String[] args) {
        T3 f1 = new T3(1401, "LAX");
        T3 f2 = new T3(93, "ORL");
        T3 f3 = new T3(101, "LAX", "DFW");
        f1.output();
        f2.output();
        f3.output();
    }
}
