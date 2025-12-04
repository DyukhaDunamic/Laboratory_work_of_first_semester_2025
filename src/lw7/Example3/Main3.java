package lw7.Example3;

public class Main3 {
    public static void main(String[] args) {

        SuperClassTest3 superObj = new SuperClassTest3(100);
        System.out.println(superObj);

        SubClassTest3One subObj = new SubClassTest3One(200, 'A');
        System.out.println(subObj);

        SubClassTest3Two subSubObj = new SubClassTest3Two(300, 'B', "Text value");
        System.out.println(subSubObj);

        subObj.setValue(555, 'Z');
        System.out.println(subObj);

        subSubObj.setValue(777, 'X', "Updated");
        System.out.println(subSubObj);
    }
}
