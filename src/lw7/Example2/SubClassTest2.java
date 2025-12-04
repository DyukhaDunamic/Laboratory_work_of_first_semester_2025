package lw7.Example2;

public class SubClassTest2 extends SuperClassTest2 {

    public int number;

    SubClassTest2(int number, String text) {
        super(text);
        this.number = number;
    }

    public void setValue() {
        super.setValue("default");
        this.number = 0;
    }

    @Override
    public void setValue(String text) {
        super.setValue(text);
    }

    public void setValue(int number) {
        this.number = number;
    }

    public void setValue(String text, int number) {
        super.setValue(text);
        this.number = number;
    }

    @Override
    public String toString() {
        String info;
        info = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " text = " + this.getText() + "\n" +
                " number = " + this.number + "\n" +
                " length = " + this.getLength();
        return info;
    }
}

