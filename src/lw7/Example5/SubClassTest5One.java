package lw7.Example5;

public class SubClassTest5One extends SuperClassTest5 {
    protected int number;

    public SubClassTest5One(String text, int number) {
        super(text);
        this.number = number;
    }

    @Override
    public void display() {
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println(" text = " + getText());
        System.out.println(" number = " + this.number);
    }
}

