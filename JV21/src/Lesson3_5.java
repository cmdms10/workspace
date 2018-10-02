import java.io.*;
public class Lesson3_5 {
    public static void main(String[] args) throws IOException {
        System.out.println("円の面積を計算するプログラム");
        System.out.print("半径を入力してください");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        double hankei = Double.parseDouble(str);
        double num = 3.14;
        double menseki = hankei * hankei * num;
        System.out.println("半径"+hankei+"の円の面積は"+menseki+"です");
    }
}
