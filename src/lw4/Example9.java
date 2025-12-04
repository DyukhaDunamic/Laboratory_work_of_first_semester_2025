package lw4;

import java.io.IOException;
import java.util.Scanner;

public class Example9 {

    public static int rent = 100;

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        int numberOfFriends = Integer.parseInt(in.nextLine());
        int totalGuests = 2;
        for (int i = 0; i < numberOfFriends; i++) {
            String answer = in.nextLine();

            if (answer.contains("+")){
                totalGuests += 2;
            }else{
                totalGuests++;
            }
        }
        if (totalGuests == 13){
            totalGuests++;
        }

        int total = totalGuests*rent;
        System.out.println(total);

        in.close();
    }
}