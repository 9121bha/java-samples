package com.bharath;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");


        int a = input.nextInt();
        int b= input.nextInt();
        int c = input.nextInt();

        //Q. FIND THE LARGEST IN 3 NUMBER

        int max = a;
        if (b> max){
            max = b;

        }
        if (c > max){
            max = c;
        }
        System.out.println("the max number is :"+ max);
    }
}
