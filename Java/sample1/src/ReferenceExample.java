public class ReferenceExample {

    static void printCardInfo(StudentCard card) {
        System.out.println("学籍番号："+card.id);
        System.out.println("名前："+card.name);
    }

    static void clearCardInfo(StudentCard card) {
        card.id = 0;
        card.name = "未定";
    }

    public static void main(String[] args) {
        StudentCard a = new StudentCard(1234, "aaa");
        a.id = 1234;
        a.name = "佐藤花子";

        printCardInfo(a);
        clearCardInfo(a);
        printCardInfo(a);

    }
}
