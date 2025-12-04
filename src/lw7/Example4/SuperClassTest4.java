package lw7.Example4;

public class SuperClassTest4 {
    public char ch;

    public SuperClassTest4(char ch) {
        this.ch = ch;
    }

    public SuperClassTest4(SuperClassTest4 other) {
        this.ch = other.ch;
    }

    @Override
    public String toString() {
        return "super\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " ch = " + this.ch;
    }
}

