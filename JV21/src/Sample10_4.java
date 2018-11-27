import java.io.*;
public class Sample10_4 {
    public static void main(String[] args) throws IOException {
        /*StringBufferクラス・Integerクラス(wrapperクラスの仲間→int型に関する機能を扱う)*/

        System.out.println("文字列を入力してください");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        System.out.println("追加する文字列を入力してください");
        String str2 = br.readLine();
        StringBuffer sb = new StringBuffer(str1);
        sb.append(str2);/*文字列の追加*/
        System.out.println(str1+"に"+str2+"を追加すると"+sb+"です。");
        System.out.println("数字を入力してください");
        String str = br.readLine();
        int num = Integer.parseInt(str);
        System.out.println(num+"が入力されました");
    }
}
