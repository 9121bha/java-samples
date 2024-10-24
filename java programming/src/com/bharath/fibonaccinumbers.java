package com.bharath;

import java.util.Scanner;

public class fibonaccinumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
                int a = 0;      // the previous index
                int b = 1;      //the current index
                int count = 2;


                while (count <= n){
                    int temp = b;
                    b= b + a;
                    a = temp;
                    count++;
                }
        System.out.println(b);
    }
}

