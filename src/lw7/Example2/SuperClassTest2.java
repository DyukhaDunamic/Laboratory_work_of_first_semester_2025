package lw7.Example2;

public class SuperClassTest2 {

    private String text;

    SuperClassTest2(String text) {
        this.text = text;
    }

    SuperClassTest2() {}

    public void setValue(String text) {
        this.text = text;
    }

    public int getLength() {
        return text == null ? 0 : text.length();
    }

    @Override
    public String toString() {
        String superClassInfo;
        superClassInfo = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " text = " + this.getText() + "\n" +
                " length = " + this.getLength();
        return superClassInfo;
    }

    public String getText() {
        return text;
    }
}
