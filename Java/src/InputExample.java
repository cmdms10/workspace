import java.util.Scanner;

public class InputExample {
    public static void countdown(int start) {
        for(int i = start; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("いくつからカウントダウンしますか？");
        int i = in.nextInt();
        System.out.println(i + "からカウントダウンします。");
        countdown(i);
    }
}
