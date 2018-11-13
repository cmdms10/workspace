public class StudentCard {
    //インスタンス変数
    int id; //学籍番号
    String name; //氏名

//    コンストラクタ追加
    StudentCard(int id,String name) {
        this.id = id;
        this.name = name;
    }

//    インスタンスメソッドの宣言
    void printinfo() {
        System.out.println("学籍番号"+id);
        System.out.println("氏名"+name);
    }
}
