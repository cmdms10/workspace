public class StaticVariableExample {
    public static void main(String[] args) {
        System.out.println("StudentCard.counter = " + StudentCard.counter);
        StudentCard a = new StudentCard(1234, "鈴木太郎");
        System.out.println("StudentCard.counter = " + StudentCard.counter);
        StudentCard b = new StudentCard(1235, "山田二郎");
        System.out.println("StudentCard.counter = " + StudentCard.counter);
    }
}
