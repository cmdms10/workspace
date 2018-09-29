class StudentCard4 {
    int id;
    String name;
}

public class ReferenceExample {
    static void printCardInfo(StudentCard4 card4) {
        System.out.println("学生番号：" + card4.id);
        System.out.println("氏名：" + card4.name);
    }

    static void clearCardInfo(StudentCard4 card4) {
        card4.id = 0;
        card4.name = "未定";
    }

    public static void main(String[] args) {
        StudentCard4 a = new StudentCard4();
        a.id = 1234;
        a.name = "鈴木太郎";

        printCardInfo(a);
        clearCardInfo(a);
        printCardInfo(a);
    }
}
