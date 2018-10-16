public class StudentCard {

    //クラス変数(フィールド(情報)の宣言)
    static int counter = 0;

    //インスタンス変数(フィールド(情報)の宣言)
    int id; //学籍番号
    String name; //氏名

    //コンストラクタ追加
    StudentCard(int id, String name) {
        this.id = id;
        this.name = name;
        StudentCard.counter++;
    }

    //インスタンスメソッドの宣言(メソッド(機能)の宣言)
    void printInfo() {
        System.out.println("学籍番号："+this.id);
        System.out.println("氏名："+this.name);
        System.out.println(StudentCard.counter);
    }


    //クラスメソッドの宣言(メソッド(機能)の宣言)
    static double getTriangleArea(double base, double height) {
        return base * height / 2;
    }





}


