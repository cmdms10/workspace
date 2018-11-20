/*Carクラス作成*/
class Car {
    int num;
    double gas;

    /*void setNum(int n) {
        num = n;
        System.out.println("車のナンバーを"+num+"にセットしました");
    }

    void setGas(double gas) {
        this.gas = gas;
        System.out.println("ガソリンの量を"+gas+"にセットしました");

    }*/

//    void show() {
//        System.out.print("\n");
//        System.out.println("車のナンバーは"+num+"です。");
//        System.out.println("ガソリンの量は"+gas+"です。");
//    }




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
/*インスタンス作成*/
/*class sample8_1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.num = 1234;
        car1.gas = 20.5;

//        System.out.println("車のナンバーは"+car1.num+"です。");
//        System.out.println("ガソリンの量は"+car1.gas+"です。");
        car1.show();


        car2.num = 1235;
        car2.gas = 12.3;

//        System.out.println("車のナンバーは"+car2.num+"です。");
//        System.out.println("ガソリンの量は"+car2.gas+"です。");

        car2.show();

    }
}*/
