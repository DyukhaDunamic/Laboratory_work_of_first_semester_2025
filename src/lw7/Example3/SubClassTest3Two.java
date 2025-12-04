package lw7.Example3;

public class SubClassTest3Two extends SubClassTest3One {

    public String text;

    SubClassTest3Two(int number, char symbol, String text) {
        super(number, symbol);
        this.text = text;
    }

    public void setValue(int number, char symbol, String text) {
        this.number = number;
        this.symbol = symbol;
        this.text = text;
    }

    @Override
    public String toString() {
        return "subtwo\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " number = " + this.number + "\n" +
                " symbol = " + this.symbol + "\n" +
                " text = " + this.text;
    }
}
