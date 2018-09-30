class StudentCard{
    static int counter = 0;

    int id;
    String name;

    StudentCard(int id, String name) {
        System.out.println("StudentCardクラスのコンストラクタが呼び出されました");
        this.id = id;
        this.name = name;
        StudentCard.counter++;
    }

    void printInfo() {
        System.out.println("学籍番号：" + id);
        System.out.println("氏名：" + name);
    }
}

public class ConstractorExample {
    public static void main(String[] args) {
        StudentCard a = new StudentCard(1234, "鈴木太郎");
        StudentCard b = new StudentCard(1235, "山田二郎");

        System.out.println(a.id);
        System.out.println(a.name);
        System.out.println("\n");
        System.out.println(b.id);
        System.out.println(b.name);
    }
}
