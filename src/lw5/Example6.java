package lw5;

public class Example6 {

    private int min;
    private int max;

    public Example6() {
        updateValues(0);
    }

    public Example6(int value) {
        updateValues(value);
    }

    public Example6(int a, int b) {
        updateValues(a, b);
    }

    public void updateValues(int value) {
        min = Math.min(min, value);
        max = Math.max(max, value);
    }

    public void updateValues(int a, int b) {
        min = Math.min(min, Math.min(a, b));
        max = Math.max(max, Math.max(a, b));
    }

    public void display() {
        System.out.printf("min: %d, max: %d%n", min, max);
    }

    public static void main(String[] args) {
        Example6 rm1 = new Example6();
        rm1.display();           // min: 0, max: 0


        Example6 rm2 = new Example6(10);
        rm2.display();           // min: 0, max: 10


        Example6 rm3 = new Example6(5, 15);
        rm3.display();           // min: 0, max: 15

        rm1.updateValues(7);
        rm1.display();           // min: 0, max: 7

        rm2.updateValues(-3, 20);
        rm2.display();           // min: -3, max: 20
    }
}
