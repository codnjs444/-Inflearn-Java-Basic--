package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly = new Child();

        Child child = (Child) poly;
        child.childmethod();

        // 일시적 다운 캐스팅
        ((Child) poly).childmethod();
    }
}
