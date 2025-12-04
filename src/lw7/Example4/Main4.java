package lw7.Example4;

public class Main4 {
    public static void main(String[] args) {
        SuperClassTest4 superObj = new SuperClassTest4('A');
        System.out.println(superObj);

        SubClassTest4 subObj = new SubClassTest4('B', "привет");
        System.out.println(subObj);

        SubClassTest4 subCopy = new SubClassTest4(subObj); // копия
        System.out.println("копия subObj:");
        System.out.println(subCopy);

        ThirdClassTest4 thirdObj = new ThirdClassTest4('C', "hello", 123);
        System.out.println(thirdObj);

        ThirdClassTest4 thirdCopy = new ThirdClassTest4(thirdObj); // копия
        System.out.println("копия thirdObj:");
        System.out.println(thirdCopy);
    }
}

