package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.ParentMethod();

        System.out.println("Child -> Child");
        Child child = new Child();
        child.ParentMethod();

        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.ParentMethod();
        //poly.ChildMethod();

    }
}

