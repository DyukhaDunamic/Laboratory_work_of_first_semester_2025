package lw5;

public class Example2 {

    private char start, end;

    public Example2(char a, char b) {
        this.start = (a <= b) ? a : b;
        this.end = (a <= b) ? b : a;
    }

    public void printRange() {
        for (char ch = start; ch <= end; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        new Example2('A', 'D').printRange();
        new Example2('Z', 'X').printRange();
        new Example2('1', '5').printRange();
    }
}
