package lw6;

public class Example1 {

    private char charField;
    private String textField;

    public void setValue(char ch) {
        charField = ch;
    }

    public void setValue(String text) {
        textField = text;
    }

    public void setValue(char[] chars) {
        if (chars.length == 1) {
            charField = chars[0];
        } else {
            textField = String.valueOf(chars);
        }
    }

    public void display() {
        System.out.println("charField: '" + charField + "'");
        System.out.println("textField: \"" + (textField != null ? textField : "null") + "\"");
    }

    public static void main(String[] args) {
        Example1 container = new Example1();

        container.setValue('X');
        container.display();

        container.setValue("Hello World");
        container.display();

        container.setValue(new char[]{'Y'});
        container.display();

        container.setValue(new char[]{'H', 'e', 'l', 'l', 'o'});
        container.display();
    }
}
