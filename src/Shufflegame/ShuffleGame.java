package Shufflegame;
import java.util.Scanner;

import java.util.*;

import java.util.Arrays;
public class ShuffleGame {
    public static void main(String[] args) {

        System.out.println("------------------------------welcome to shuffle game--------------------------------");
        System.out.println("Guess where the 0 is?");
        System.out.println("Are you ready to start? y/n");

        List<Integer> arrayList = Arrays.asList(1, 0, 1);
        Scanner sc = new Scanner(System.in);
        String userChoice = sc.nextLine();
        int position = 0;
        boolean flag = true;
        if (userChoice.equals("y")) {
            while (flag) {
                Collections.shuffle(arrayList);
                System.out.println("Pick the position: either 1,2,3");
                int num = sc.nextInt();
                for (int i = 0; i <= arrayList.size(); i++) {
                    position = arrayList.indexOf(0);
                }
                if (position + 1 == num) {
                    System.out.println("Good guess");
                    flag = false;
                } else {
                    System.out.println("Sorry!!! wrong guess");
                    System.out.println("Do you want to try again? y / n");
                    String userContinue = sc.nextLine();
                    if(userContinue.equals("n")){
                        System.out.println("See you next time");
                    }
                    flag = true;
                }
            }
        }else{
            System.out.println("Goodbye!");
        }

    }

}


