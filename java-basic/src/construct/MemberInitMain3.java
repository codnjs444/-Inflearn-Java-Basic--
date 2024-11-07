package construct;

public class MemberInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("user1",15,15);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2",15,15);

        MemberInit[] members = {member1, member2};
        for (MemberInit member : members) {
            System.out.println(member.name + member.age + member.grade);
        }
    }
}
