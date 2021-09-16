public class Scope {
    int varA = 10;
    double varB = 12.2;

    void methodA(int varC) {
        int varA = 3;
        int varD = varC + varA;
        double varE = varB * varD;
        System.out.println(varA);
        System.out.println(varE);
    }

    public static void main(String[] args) {
        Scope scopeObj = new Scope();
        scopeObj.methodA(42);
    }
}
