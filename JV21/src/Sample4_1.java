import java.io.*;

public class Sample4_1 {
    public static void main(String[] args) throws IOException {
        /*文字入出力*/
        System.out.println("数字を入力してください");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        System.out.println(num+"が入力されました");
        num *= 3;
        System.out.println(num);
    }

}
