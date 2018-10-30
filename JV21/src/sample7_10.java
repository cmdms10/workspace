public class sample7_10 {
    public static void main(String[] args) {
        /*多次元配列*/
        /*型名[][] 配列名 = new 型名[要素数][要素数];*/
        int[][] test;
        test = new int [2][5];  /*2*5→10の要素*/

        test[0][0] = 80;
        test[0][1] = 60;
        test[0][2] = 22;
        test[0][3] = 50;
        test[0][4] = 75;

        test[1][0] = 90;
        test[1][1] = 55;
        test[1][2] = 68;
        test[1][3] = 72;
        test[1][4] = 58;

        /*多次元配列の要素*/
/*
        int [][] test = {{80,60,22,50},{90,55,68,72},{33,75,63}};
*/

        /*２科目５人の得点出力*/
        /*for(int i=0; i<2; i++) {
            for(int j=0; j<5; j++) {
                System.out.println((j+1)+"番目の人の科目"+(i+1)+"の得点は"+test[i][j]+"点です");
                System.out.println();
            }
        }*/
        for(int i=0; i<test[0].length/*5*/; i++) {
            for(int j=0; j<test.length/*2*/; j++) {
                System.out.println((i+1)+"番目の人の科目"+(j+1)+"の得点は"+test[j][i]+"点です。");
            }
            System.out.println();
        }
    }
}
