package com.lisovski;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.print(a + " " + b + " " + " " + " ");
        a += b;
        b = a - b;
        a = a - b;
        System.out.print(a + " " + b);
        /*
            a=a*b;
            a=b/a;
            b=b/a;
        */
    }
}