package lw7.Example3;

public class SuperClassTest3 {

    public int number;

    SuperClassTest3(int number) {
        this.number = number;
    }

    SuperClassTest3() {}

    public void setValue(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "super\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " number = " + this.number;
    }
}
