public class StudentCard {
//    インスタンス変数の宣言
    protected int id; //学籍番号
    protected String name; //氏名

    /*StudentCard(int id, String name) {
        this.id = id;
        this.name = name;
    }*/

    void printinfo() {
        System.out.println("学籍番号："+this.id);
        System.out.println("氏名："+this.name);
    }


}

class Person {
    void work() {
        System.out.println("人です。仕事します");
    }
}

class Teacher extends Person {
    void work() {
        System.out.println("教員です。授業をします。");
    }
    void makeTest() {
        System.out.println("試験問題を作ります。");
    }
}

class Student extends Person {
    void work() {
        System.out.println("学生です。勉強します。");
    }
}

class car {

}

abstract class Myobject {

}