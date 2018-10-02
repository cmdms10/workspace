import java.io.*;
public class Lesson3_4 {
    public static void main(String[] args) throws IOException{
        System.out.println("円周率を値はいくつですか");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println("円周率の値は"+str+"です");
    }
}
