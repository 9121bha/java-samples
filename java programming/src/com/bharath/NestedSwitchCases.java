package com.bharath;

import java.util.Scanner;

public class NestedSwitchCases {
    public static void main(String[] args) {
        // nested switch cases are basically the witch case inside the switch case

        Scanner input = new Scanner(System.in);
        int empId = input.nextInt();
        String department = input.next();


        switch (empId){
            case 1:
                System.out.println("BALAM BHARATH");
                break;
            case 2:
                System.out.println("BALOMRI ANITHA SREE");
                break;
            case 3:
                System.out.println("emp num 3");
                switch (department){
                    case "commerece":
                        System.out.println(" DEPT OF COMMERECE");
                        break;
                    case "arts":
                        System.out.println("DEPT OF ARTS");
                        break;
                    default:
                        System.out.println("ENTER A VAILD DEPARTMENT");
                }

                break;

            default:
                System.out.println("enter a correct empId");



        }


    }
}
