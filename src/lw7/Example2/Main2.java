package lw7.Example2;

public class Main2 {

    public static void main(String[] args) {

        SuperClassTest2 superObject =
                new SuperClassTest2("текст суперкласса");
        System.out.println(superObject.toString());

        SubClassTest2 subObject1 =
                new SubClassTest2(10, "текст подкласса");
        System.out.println(subObject1.toString());

        SubClassTest2 subObject2 =
                new SubClassTest2(123, "два параметра конструктора");
        System.out.println(subObject2.toString());

        subObject2.setValue();
        System.out.println(subObject2.toString());

        subObject2.setValue("новый текст");
        System.out.println(subObject2.toString());

        subObject2.setValue(777);
        System.out.println(subObject2.toString());

        subObject2.setValue("combo", 42);
        System.out.println(subObject2.toString());
    }
}
