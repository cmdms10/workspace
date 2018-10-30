public class sample7_3 {
    public static void main(String[] args) {
//        配列
//        型名[] 配列名 = new 型名[要素数]
        int[] test1 = new int[5];
        test1[0] = 80;
        test1[1] = 60;
        test1[2] = 22;
        test1[3] = 50;
        test1[4] = 75;

        for(int i=0; i<5; i++) {
            System.out.println((i+1)+"人目の点は"+test1[i]+"です。");
        }

        System.out.println();

//        配列の初期化
//        int[] test2 = new int[5];
        int[] test2 = {80,60,22,50,75};

        for(int i=0; i<5; i++) {
            System.out.println((i+1)+"人目の点は"+test2[i]+"です。");
        }
    }
}
