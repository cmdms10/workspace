class Car {
    private int num;
    private double gas;

    void setNum(int n) {
        num = n;
        System.out.println("車のナンバーを"+num+"にセットしました");
    }

    void setGas(double gas) {
        this.gas = gas;
        System.out.println("ガソリンの量を"+gas+"にセットしました");
    }

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

    public Car(){
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("車のナンバーは"+num+"にしました");
        System.out.println("ガソリンの量は"+gas+"にしました");
    }
}
