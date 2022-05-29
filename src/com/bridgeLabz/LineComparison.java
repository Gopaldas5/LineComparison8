package com.bridgeLabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome Line comparison computation program on master branch ");
        int x1, x2, x3, x4;
        int y1, y2, y3, y4;
        double length1;
        double length2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x1 point:- ");
        x1 = scanner.nextInt();
        System.out.println("Enter y1 point:- ");
        y1 = scanner.nextInt();
        System.out.println("Enter x2point:- ");
        x2 = scanner.nextInt();
        System.out.println("Enter y2 point");
        y2 = scanner.nextInt();

        length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance between two point in line1 is:-  " + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + "):- " + length1);
        Double line1 = Double.valueOf(length1);
    }
}
