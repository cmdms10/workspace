import java.io.*;

public class Sample4_3 {
    public static void main(String[] args) throws IOException {
        System.out.println("整数を３つ入力してください。");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*        String str1 = br.readLine();
        int num1 = Integer.parseInt(str1);

        String str2 = br.readLine();
        int num2 = Integer.parseInt(str2);

        String str3 = br.readLine();
        int num3 = Integer.parseInt(str3);

        int sum = num1+num2+num3;
        System.out.println("３つの数の合計は"+sum+"です");*/

        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();

        int sum = 0;
        sum += Integer.parseInt(str1);
        sum += Integer.parseInt(str2);
        sum += Integer.parseInt(str3);

        System.out.println("３つの数の合計は"+sum+"です");
    }
}
