public class ForExample2 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i <= 100; i++) {
            sum += 1;
            System.out.println(i+"を加えました。");
        }
        System.out.println("合計は"+sum+"です");
    }
}
