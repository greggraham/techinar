import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<String>();
        mySet.add("A");
        mySet.add("B");
        mySet.add("C");
        mySet.add("A");
        System.out.println(mySet);
        mySet.remove("B");
        System.out.println(mySet);
        mySet.add("D");
        System.out.println(mySet);
    }
}
