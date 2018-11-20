/*クラスライブラリ
*   よく利用する機能がまとめられている
*   Stringクラス・・・文字列を扱うクラス
*   Systemクラス・・・文字列の概念（クラス）
*   Integerクラス・・・"Hello"などの具体的な文字列（オブジェクト）*/

public class Sample10_1 {
    public static void main(String[] args) {
        String str = "Hello";
        char ch1 = str.charAt(0);/*引数で指定した位置にある文字を返す*/
        char ch2 = str.charAt(1);
        int len = str.length();/*文字列の長さを返す*/
        System.out.println(str+"の１番目の文字は"+ch1+"です");
        System.out.println(str+"の２番目の文字は"+ch2+"です");
        System.out.println(str+"の長さは"+len+"です");

        String stru = str.toUpperCase();
        String strl = str.toLowerCase();

        System.out.println("大文字に変換："+stru);
        System.out.println("小文字に変換："+strl);
    }
}
