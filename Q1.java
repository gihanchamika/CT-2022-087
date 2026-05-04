public class Q1 {
    public static void main(String[] args) {
        double A = 2, B = 3, C = 4;
        double X = 5, Y = 2;
        double r = 7;

        // a
        double resultA = Math.sqrt((B * B) + (4 * A * C));

        // b
        double resultB = Math.sqrt(X + 4 * Math.pow(Y, 3));

        // c
        double resultC = Math.cbrt(X * Y);

        // d
        double area = Math.PI * r * r;

        System.out.println("a: " + resultA);
        System.out.println("b: " + resultB);
        System.out.println("c: " + resultC);
        System.out.println("d: " + area);
    }
}
