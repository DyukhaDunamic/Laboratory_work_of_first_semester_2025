package lw5;

public class Example5 {

    private int value;

    public Example5() {
        setValue();
    }

    public Example5(int num) {
        setValue(num);
    }

    public void setValue() {
        this.value = 0;
    }

    public void setValue(int num) {
        this.value = Math.min(num, 100);
    }

    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        Example5 obj1 = new Example5();
        Example5 obj2 = new Example5(50);
        Example5 obj3 = new Example5(150);

        obj1.setValue(75);
        obj2.setValue();
        obj3.setValue(200);

        System.out.println("obj1: " + obj1.getValue()); // 75
        System.out.println("obj2: " + obj2.getValue()); // 0
        System.out.println("obj3: " + obj3.getValue()); // 100
    }
}
