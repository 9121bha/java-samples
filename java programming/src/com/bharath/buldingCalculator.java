package com.bharath;

import java.util.Scanner;

public class buldingCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // take input from user until user does not press X nad X

     int ans = 0;
        while (true){
            System.out.println(" enter the opearotr");
            char op = input.next().trim().charAt(0);
         //  System.out.println(" enter the opearotr");
            if (op == '+' || op == '-' || op == '*' || op == '/' || op =='%'){
                // take input of two numbers
            //  System.out.println(" enter the opearotr");

                System.out.println("enter number 1");
                System.out.println("enter number 2");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op == '+'){
                    ans = num1 + num2;

                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0){
                        ans = num1 / num2;
                    }

                }
                if (op == '%') {
                    ans = num1 % num2;
                } else if (op =='x' || op == 'X') {
                    break;
                }

                System.out.println(ans);

            }
           // System.out.println(ans);
        }
      //System.out.println(ans);
    }
}
