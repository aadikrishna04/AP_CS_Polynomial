public class Runner {
    public static void main(String[]args) {
        Monomial first = new Monomial(1.0, 2);
        Monomial second = new Monomial(2.0, 1);
        Monomial third = new Monomial(3.0, 0);
        Polynomial poly = new Polynomial(first, second, third);
        System.out.println("\n");
        System.out.println(poly.evaluate(4.5));
        System.out.println(poly.toString()); 

        // 1
        System.out.println("\n");
        Polynomial p1 = new Polynomial(new Monomial(4.32, 2), new Monomial(-2.12, 1), new Monomial(3.67, 0));
        System.out.println(p1.evaluate(2));

        // 2
        System.out.println("\n");
        Polynomial p2 = new Polynomial(new Monomial(-0.05, 2), new Monomial(2, 1), new Monomial(2, 0));
        for (int i = 1; i <= 8; i++) {
            System.out.println("Hour: " + i + " " + p2.evaluate(i));
        }

        // 3
        System.out.println("\n");
        Polynomial p3 = new Polynomial(new Monomial(3, 0), new Monomial(50, 1), new Monomial((-9.81/2), 2));
        for (int i = 0; i < 1000; i++) {
            if (p3.evaluate(i/10) > 100.0) {
                System.out.println(i/10);
                break;
            }
        }
    }
}
