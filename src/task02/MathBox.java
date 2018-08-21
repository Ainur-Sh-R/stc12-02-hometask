package task02;

public class MathBox {

    public static void main(String[] args) {

        try {
            new MathBox().factorial(10);
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError");
        }


        try {
            double x = (new MathBox()).dividerExceptionInside(5, 0);
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }


        try {
            double x = (new MathBox()).divider(100, 35);
        } catch (MyException e) {

        }

    }

    public int summa(Integer a, Integer b) {
        return a + b;
    }

    public int diff(Integer a, Integer b) {
        return a - b;
    }

    public long factorial(Integer a) {
        if (a == 1) return 1;
        else return a * factorial(a);
    }

    public double dividerExceptionInside(Integer a, Integer b) {
        if (b == 0) return 0.0;
        else return ((double) a / b);
    }

    public double divider(Integer a, Integer b) throws MyException {
        throw new MyException(a, b);
    }

}
