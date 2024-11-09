package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "name");
        member.print();
        member.changeData("www");
        member.print();
        
    }
}
