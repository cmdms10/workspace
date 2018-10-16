public class test {
    public static void main(String[] args) {
        IStudentCard a = new IStudentCard();
        a.id = 1234;
        a.name = "hoge";
        a.country = "イギリス";
        a.printinfo();

        StudentCard b = new StudentCard();
        b.id = 1235;
        b.name = "hogu";

        b.printinfo();
    }
}
