public class SwitchExample {
    public static void main(String args[]) {
        int score;
        score = 1;
        switch(score){
            case 1:
                System.out.println("頑張りましょう");
                break;
            case 2:
                System.out.println("普通です");
                break;
            case 3:
                System.out.println("最高です");
                break;
            default:
                System.out.println("想定されていない点数です");
        }
        System.out.println("switchブロックを抜けました");
    }
}
