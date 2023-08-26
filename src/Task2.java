public class Task2 {
    private int a = 3;
    private int b = 7;

    public void swapVariables() {
        b = a + b;
        a = b - a;
        b = b - a;
    }

    public int getB() {
        return b;
    }

    public int getA() {
        return a;
    }
}
