package lw7.Example4;

public class ThirdClassTest4 extends SubClassTest4 {
    public int num;

    public ThirdClassTest4(char ch, String text, int num) {
        super(ch, text);
        this.num = num;
    }

    public ThirdClassTest4(ThirdClassTest4 other) {
        super(other);
        this.num = other.num;
    }

    @Override
    public String toString() {
        return "third\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " ch = " + this.ch + "\n" +
                " text = " + this.text + "\n" +
                " num = " + this.num;
    }
}
