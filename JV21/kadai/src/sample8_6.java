class Car{
    private int num;
    private double gas;

    //    ナンバーのgetメソッド
    int getNum() {
        System.out.println("ナンバーを調べました。");
        return num;
    }

    //    ガソリンのgetメソッド
    double getGas() {
        System.out.println("ガソリンの量を調べました。");
        return gas;
    }

    //    ナンバーとガソリンのsetメソッド
    void setNumGas(int n,double g) {
        num = n;
        gas = g;
        System.out.println("車のナンバーを"+num+"に、ガソリンの量を"+gas+"にしました");
    }

    //    表示用メソッド
    void show() {
        System.out.println("車のナンバーは"+num+"です");
        System.out.println("ガソリンの量は"+gas+"です");
    }
}


public class sample8_6 {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setNumGas(1234,20.5);

        int number = car1.getNum();
        double gasoline = car1.getGas();
        car1.show();

//        numberとgasolineを使ってい設定を表示
        System.out.println("ナンバーは"+number+"です。ガソリンは"+gasoline+"でした");
    }
}
