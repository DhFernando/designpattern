public class Main {
    public static void main(String arg[]) {
        Calculation c = new Calculation();
        c.add(4, 7);
        c.add(4, 7, 8);
        c.add(4.5, 5.0);
        c.add(45, 5.0);
    }
}

class Calculation {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void add(double a, double b) {
        System.out.println(a + b);
    }

    public void add(int a, double b) {
        System.out.println(a + b);
    }
}