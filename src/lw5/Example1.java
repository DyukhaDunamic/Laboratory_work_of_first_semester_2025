package lw5;

public class Example1 {

    private char symbol;

    public void setSymbol(char ch) {
        this.symbol = ch;
    }

    public int getSymbolCode() {
        return (int) this.symbol;
    }

    public void displaySymbolInfo() {
        System.out.println("Символ: " + this.symbol);
        System.out.println("Код символа: " + (int) this.symbol);
    }

    public static void main(String[] args) {
        Example1 sp = new Example1();

        sp.setSymbol('A');

        int code = sp.getSymbolCode();
        System.out.println("Полученный код: " + code);

        sp.displaySymbolInfo();

    }
}

