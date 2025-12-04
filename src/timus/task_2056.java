package timus;

import java.util.Scanner;

public class task_2056 {

    public static String getScholarshipType(int[] grades) {
        boolean hasThree = false;
        boolean allFives = true;
        int sum = 0;

        for (int grade : grades) {
            if (grade == 3) {
                hasThree = true;
            }
            if (grade != 5) {
                allFives = false;
            }
            sum += grade;
        }

        if (hasThree) {
            return "None";
        }

        if (allFives) {
            return "Named";
        }

        double average = (double) sum / grades.length;

        if (average >= 4.5) {
            return "High";
        }

        return "Common";
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] grades = new int[n];
        for (int i = 0; i < n; i++) {
            grades[i] = in.nextInt();
        }

        String result = getScholarshipType(grades);
        System.out.println(result);

        in.close();
    }
}
