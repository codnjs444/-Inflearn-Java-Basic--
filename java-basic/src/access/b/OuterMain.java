package access.b;

import access.a.AccessData;

public class OuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();
//
//        data.defaultField = 2;
//        data.defaultMethod();

        data.privateMethod();

        data.inneerAccess();
    }
}
