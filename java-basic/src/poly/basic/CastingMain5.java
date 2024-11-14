package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.ParentMethod();
        if (parent instanceof Child) {
            System.out.println("child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childmethod();
        } else {
            System.out.println("Child 인스턴스 아님");
        }
    }

}
