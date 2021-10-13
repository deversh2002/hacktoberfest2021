package com.company;
import java.util.Scanner;

public class percentage_of_students {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the marks of first subject: ");
        int a = s.nextInt();
        System.out.print("Enter the marks of second subject: ");
        int b = s.nextInt();
        System.out.print("Enter the marks of third subject: ");
        int c = s.nextInt();
        System.out.print("Enter the marks od fourth subject: ");
        int d = s.nextInt();
        System.out.print("Enter the marks of fifth subject: ");
        int e = s.nextInt();
        int sum = a +b +c +d +e;
        float percentage = sum*100/500f;
        System.out.print("Your result is " + percentage + " % ");



    }
}
