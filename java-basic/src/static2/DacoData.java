package static2;

public class DacoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        /*instanceValue++;
        instancemethod();*/

        staticValue++;
        staticMethod();
    }

    public void instanceCall() {
        instanceValue++;
        instancemethod();

        staticValue++;
        staticMethod();
    }

    private void instancemethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
