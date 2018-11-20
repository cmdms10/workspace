class Car2 {
    public static int sum = 0;
    private int num;
    private double gas;

    public Car2() {
        num = 0;
        gas = 0.0;
        sum++;
        System.out.println("車を作りました");
    }

    public void setCar2(int n, double g) {
        num = n;
        gas = g;
        System.out.println("ナンバーを"+num+"にガゾリン量を"+gas+"にしました");
    }

    public void setCar(int n, double g){
        num = n;
        gas = g;
        System.out.println("ナンバーを"+num+"にガソリン量を"+gas+"にしました。");
    }

    public static void showSum() {
        System.out.println("車は全部で"+sum+"台あります。");
    }

    public void show() {
        System.out.println("車のナンバーは"+num+"です");
        System.out.println("ガソリンの量は"+gas+"です");
    }
}

public class sample9_8 {
    public static void main(String[] args) {

        Car2.showSum();
        Car2 car2 = new Car2();
        car2.setCar2(1234,20.5);
        Car2.showSum();
        Car2 car3 = new Car2();
        car3.setCar(5678,30.5);
        Car2.showSum();
    }
}
