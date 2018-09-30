public class Instance_sample {

    public static void main(String[] args) {
        //インスタンスa
        StudentCard a = new StudentCard(1234, "ほげ");
        //インスタンスb
        StudentCard b = new StudentCard(1235, "ほぐ");
        //インスタンスc
        StudentCard c = new StudentCard(1236, "山田二郎");

        System.out.println(a.id);
        System.out.println(a.name);
        System.out.println(StudentCard.counter);

        //printInfoメソッドを呼び出す
        b.printInfo();

        //クラス名.メソッド名で呼び出す
        System.out.println("底辺が10、高さが５の三角形の面積は"
                + StudentCard.getTriangleArea(10.0, 5.0) + "です");
    }
}
