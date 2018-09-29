class VirtualDog {
    String name;  //名前
    int maxEnergy; //最大体力
    int Energy; //現在の体力
}

public class VirtualPetGame {
    public static void main(String[] args) {
        VirtualDog taro = new VirtualDog();
        taro.name = "タロ";
        taro.maxEnergy = 100;
        taro.Energy = 50;

        VirtualDog jiro = new VirtualDog();
        jiro.name = "ジロ";
        jiro.maxEnergy = 80;
        jiro.Energy = 40;

        //バーチャルペット taro の情報を出力
        System.out.println("名前："+taro.name);
        System.out.println("最大体力："+taro.maxEnergy);
        System.out.println("現在の体力："+taro.Energy);

        //バーチャルペット jiro の情報を出力
        System.out.println("名前："+jiro.name);
        System.out.println("最大体力："+jiro.maxEnergy);
        System.out.println("現在の体力："+jiro.Energy);
    }
}
