import java.io.*;

public class Lesson3_3 {
    public static void main(String[] args) throws IOException{
        System.out.println("あなたは何歳ですか？");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int age = Integer.parseInt(str);
        System.out.println("あなたは"+age+"歳ですね。");
        age += 10;
        System.out.println("10年後は、"+age+"歳だね、");
    }
}
