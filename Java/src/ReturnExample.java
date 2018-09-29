public class ReturnExample {
    public static double getAreaOfExample (double radius) {
        return radius * radius * 3.14;
    }

    public static void main(String[] args) {
        double circleArea = getAreaOfExample(2.5);
        System.out.println(circleArea);
    }
}
