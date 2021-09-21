public class StringTester {
    public static void main(String[] args) {
        String str = "";
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str += "a";
        }
        long endTime1 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append("b");
        }
        long endTime2 = System.currentTimeMillis();

        System.out.println("String took: " + (endTime1 - startTime1) + "ms");
        System.out.println("StringBuilder took: " + (endTime2 - startTime2) + "ms");
        System.out.println(str.substring(0, 20));
        System.out.println(sb.substring(0, 20));
    }
}
