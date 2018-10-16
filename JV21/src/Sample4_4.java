public class Sample4_4 {
    public static void main(String[] args) {
        /*型変換(キャスト)*/
        int inum = 160;
        System.out.println("身長は"+inum+"センチです。");
        double dnum = (double)inum;
        System.out.println("double型の変数に代入");
        System.out.println("身長は"+dnum+"センチです。");
    }
}
