package lw6;

public class Example2 {

    private static int counter = 0;

    public static void showAndIncrement() {
        System.out.println(counter);
        counter++;
    }

    public static void main(String[] args) {
        showAndIncrement();
        showAndIncrement();
        showAndIncrement();
        showAndIncrement();
    }
}

