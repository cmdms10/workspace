/*入力文字を逆順にする*/
import java.io.*;
public class Kadai2_2 {
    public static void main(String[] args) throws IOException {
        System.out.println("文字を入力してください");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        StringBuffer sb = new StringBuffer(str1);

        System.out.println(str1+"を逆順にすると"+sb.reverse()+"です。");
    }
}
