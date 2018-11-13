public class sample1 {
    public static void main(String[] args) {
        StudentCard a = new StudentCard(/*1234,"佐藤"*/);
        a.id = 1234;
        a.name = "佐藤";

        a.printinfo();

        IStudentCard b = new IStudentCard(/*1235,"山田"*/);
        b.id = 1235;
        b.name = "山田";
        b.nationality = "イギリス";

        b.printinfo();

        StudentCard c = new IStudentCard();
        c.id = 1236;
        c.name = "鈴木";
        ((IStudentCard) c).nationality = "日本";

        c.printinfo();

    }
}
