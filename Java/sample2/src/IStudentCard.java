public class IStudentCard extends StudentCard{
    String country; //国籍

    void printinfo() {
/*        System.out.println("学籍番号："+this.id);
        System.out.println("氏名："+this.name);*/
        //スーパークラスのメソッドを呼び出す
        super.printinfo();
        System.out.println("国籍："+this.country);
    }
}
