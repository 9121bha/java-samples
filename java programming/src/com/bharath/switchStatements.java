package com.bharath;

import java.util.Scanner;

public class switchStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       String fruit = input.next();

        switch (fruit) {
            case "mango":
                System.out.println("king of fruits");
                break;
            case "apple":
                System.out.println("a red fruit");
                break;
            case "orange":
                System.out.println("a sweet fruit ");
                break;
            case "grapes":
                System.out.println("a small fruit");
                break;
            default:
                System.out.println("please enter a vaild fruit");
                break;
        }


         int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wendesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("enter a valid day");
                break;
        }
    }
}
