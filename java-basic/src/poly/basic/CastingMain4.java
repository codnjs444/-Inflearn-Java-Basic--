package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.ParentMethod();

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; // runtime 오류 ClassCastException
        child2.childmethod();
    }

}
