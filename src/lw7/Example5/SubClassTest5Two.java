package lw7.Example5;

public class SubClassTest5Two extends SuperClassTest5 {
    protected char ch;

    public SubClassTest5Two(String text, char ch) {
        super(text);
        this.ch = ch;
    }

    @Override
    public void display() {
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println(" text = " + getText());
        System.out.println(" ch = " + this.ch);
    }
}

