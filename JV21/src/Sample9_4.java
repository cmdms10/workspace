class Car1 {
    //インスタンス変数
    private int num;
    private double gas;

    public Car1() {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }

    public Car1(int n, double g) {
        num = n;
        gas = g;
//        コンストラクタのオーバーロード（多重定義）
        System.out.println("ナンバー"+num+"ガソリン量"+gas+"の車を作成しました。");
    }

    //インスタンスメソッド
    public void show() {
        System.out.println("車のナンバーは"+num+"です");
        System.out.println("ガソリンの量は"+gas+"です");

    }
}

public class Sample9_4 {
    public static void main(String[] args) {
        Car1 car1 = new Car1();

        car1.show();

        Car1 car2 = new Car1(1234,20.5);

        car2.show();
    }
}
