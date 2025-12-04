package lw5;

public class Example4 {

    private char charField;
    private int intField;

    public Example4(int num, char ch) {
        this.intField = num;
        this.charField = ch;
    }

    public Example4(double value) {
        this.charField = (char) (int) value;
        this.intField = (int) Math.round((value - (int) value) * 100);
    }

    @Override
    public String toString() {
        return "{" + charField + ", " + intField + "}";
    }

    public static void main(String[] args) {
        System.out.println(new Example4(42, 'X'));
        System.out.println(new Example4(65.1267));
        System.out.println(new Example4(97.89));
    }
}
