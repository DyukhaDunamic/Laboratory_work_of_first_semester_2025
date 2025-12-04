package lw5;

public class Example3 {

    private int first, second;

    public Example3() {}

    public Example3(int value) {
        this.first = this.second = value;
    }

    public Example3(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    public static void main(String[] args) {
        System.out.println(new Example3());
        System.out.println(new Example3(5));
        System.out.println(new Example3(10, 20));
    }
}

