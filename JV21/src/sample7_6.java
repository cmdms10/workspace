public class sample7_6 {
    public static void main(String[] args) {
        int[] test1 = new int[3];
        test1[0] = 80;
        test1[1] = 60;
        test1[2] = 22;
        int[] test2;
        test2 = test1;      /*int[]型同士の代入化*/
        for(int i=0; i<3; i++) {
            System.out.println("test1配列"+(i+1)+"番目の人の点は"+test1[i]+"点です。");
            System.out.println("test2配列"+(i+1)+"番目の人の点は"+test2[i]+"点です。");
            System.out.println();
        }

        test1[2] = 100; /*test1配列の３番目の人を満点に*/
        for(int i=0; i<3; i++) {
            System.out.println("test1配列"+(i+1)+"番目の人の点は"+test1[i]+"点です。");
        }
        System.out.println();
        for(int i=0; i<3; i++) {
            System.out.println("test2配列"+(i+1)+"番目の人の点は"+test2[i]+"点です。");
        }

    }
}
