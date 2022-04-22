package com.lisovski;

import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        int c=0,h=0,o=0,maxVal;
        Scanner scanner = new Scanner(System.in);
        c = scanner.nextInt();
        h = scanner.nextInt();
        o = scanner.nextInt();
        if((c/2<=h/6)&&(c/2<=o)) {
            System.out.println(c);
        }
        else if ((h/6<=c/2)&&(h/6<=o)) {
            System.out.println(h);
        }
        else
            System.out.println(o);
    }
}
