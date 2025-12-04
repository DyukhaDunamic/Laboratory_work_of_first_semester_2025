package lw7.Example5;

public class Main5 {

    public static void main(String[] args) {
        SuperClassTest5 s = new SuperClassTest5("Текст суперкласса");
        s.display();
        System.out.println();

        SubClassTest5One a = new SubClassTest5One("Текст подкласса A", 42);
        a.display();
        System.out.println();

        SubClassTest5Two b = new SubClassTest5Two("Текст подкласса B", 'Z');
        b.display();
        System.out.println();

        SuperClassTest5 ref;

        ref = new SubClassTest5One("Полиморфный A", 7);
        ref.display();
        System.out.println();

        ref = new SubClassTest5Two("Полиморфный B", 'X');
        ref.display();
    }
}

