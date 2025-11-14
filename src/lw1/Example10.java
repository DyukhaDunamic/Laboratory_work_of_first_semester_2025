package lw1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the year of birth: ");
        int birthYear = in.nextInt();

        int currentYear = LocalDate.now().getYear();

        int age = currentYear - birthYear;

        System.out.println("Your age: " + age + " years old");

        in.close();

    }


}
