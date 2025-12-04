package lw7.Example3;

public class SubClassTest3One extends SuperClassTest3 {

    public char symbol;

    SubClassTest3One(int number, char symbol) {
        super(number);
        this.symbol = symbol;
    }

    public void setValue(int number, char symbol) {
        this.number = number;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "subone\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " number = " + this.number + "\n" +
                " symbol = " + this.symbol;
    }
}

