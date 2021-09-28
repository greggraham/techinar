public class T2 {

    int[] ps = {1, 3, 5, 7, 11, 13};
    double x = 17.5;

    static void alt1(double a) {
        a = 2.2;
    }

    static void alt2(int[] as) {
        as[0] = 2;
    }

    public static void main(String[] args) {
        T2 obj = new T2();

        alt1(obj.x);
        alt2(obj.ps);
        System.out.println(obj.x + ", " + obj.ps[0]);
    }
}
