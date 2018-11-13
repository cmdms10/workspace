public class sample1 {
    public static void main(String[] args) {
        StudentCard a = new StudentCard(0001,"hoge");
        StudentCard b = new StudentCard(0002, "hogehoge");

        a.printinfo();
        System.out.println("\n");
        b.printinfo();
    }
}
