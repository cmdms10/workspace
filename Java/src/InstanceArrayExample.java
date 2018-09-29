class StudentCard3 {
    int id;
    String name;
}
public class InstanceArrayExample {
    public static void main(String[] args) {
        StudentCard3[] cards = new StudentCard3[3];
        cards[0] = new StudentCard3();
        cards[0].id = 1234;
        cards[0].name = "鈴木太郎";
        cards[1] = new StudentCard3();
        cards[1].id = 1235;
        cards[1].name = "佐藤花子";
        cards[2] = new StudentCard3();
        cards[2].id = 1236;
        cards[2].name = "山田二郎";

        for(int i = 0; i < 3; i++) {
            System.out.println("cards["+ i +"]の" + "idは"+cards[i].id + "、nameは" + cards[i].name);
        }
    }
}
