/*文字列の中から指定した文字を検索*/
import java.io.*;
public class Kadai_2_1 {
    public static void main(String[] args) throws IOException {
        System.out.println("文字列を入力してください");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        System.out.println("検索文字を入力してください");
        BufferedReader cr = new BufferedReader(new InputStreamReader(System.in));
        String str2 = cr.readLine();

        int result = str1.indexOf(str2);
        result++;

        System.out.println(str1+"の"+result+"番目に「"+str2+"」が見つかりました");

    }
}
