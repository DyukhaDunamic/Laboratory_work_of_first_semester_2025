package lw7.Example5;

public class SuperClassTest5 {
    private String text;

    public SuperClassTest5(String text) {
        this.text = text;
    }

    public void display() {
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println(" text = " + this.text);
    }

    public String getText() {
        return text;
    }
}
