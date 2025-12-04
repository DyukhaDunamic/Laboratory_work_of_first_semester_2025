package lw7.Example4;

public class SubClassTest4 extends SuperClassTest4 {
    public String text;

    public SubClassTest4(char ch, String text) {
        super(ch);
        this.text = text;
    }

    public SubClassTest4(SubClassTest4 other) {
        super(other);
        this.text = other.text;
    }

    @Override
    public String toString() {
        return "sub\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " ch = " + this.ch + "\n" +
                " text = " + this.text;
    }
}

