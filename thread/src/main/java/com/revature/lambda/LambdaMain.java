package com.revature.lambda;

import java.util.Scanner;

public class LambdaMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number:");
        int a=sc.nextInt();

        System.out.println("enter a number:");
        int b= sc.nextInt();
        sc.nextLine();

        System.out.println("enter operation name:");
        String c=sc.nextLine();

        Lambda lambda=(x,y,z)->{
            switch (z){
                case "add":
                    System.out.println("sum:"+(a+b));
                    break;
                case "subtract":
                    System.out.println("subtract:"+(a-b));
                    break;
                case "multiply":
                    System.out.println("multiply:"+(a*b));
                    break;
                case "division":
                    System.out.println("division:"+(a/b));
                    break;
                default:
                    System.out.println("invalid operation name");
            }
        };
        lambda.maths(a,b,c);
        sc.close();
    }
}
