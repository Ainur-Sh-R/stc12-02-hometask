package task02;

public class MyException extends Exception {
    public MyException() {
    }

    public MyException(int a, int b) {
        double d = divider(a, b);
        System.out.println(d);
    }

    public double divider(Integer a, Integer b) {
        if (b == 0) return 0.0;
        else return ((double) a / b);
    }

}
