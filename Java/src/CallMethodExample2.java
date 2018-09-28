public class CallMethodExample2 {

    public static void methodB() {
        System.out.println("methodBです。");
        methodA();

    }

    public static void main(String[] args) {
        methodB();
        methodA();
    }

    public static void methodA() {
        System.out.println("methodAです。");
    }
}
