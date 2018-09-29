public class OverExample {
    public static void methodA() {
        System.out.println("引数はありません");
    }

    public static void methodB(int i) {
        System.out.println("int型の値" + i);
    }

    public static void methodC(double d) {
        System.out.println("double型の値" + d);
    }

    public static void methodD(String s) {
        System.out.println("Stringの値" + s);
    }

    public static void main(String[] args) {
        methodC(4.2);
        methodB(9);
        methodD("Hello");
        methodA();
    }
}
