package com.lisovski;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        if(a<=b)
        {
            int maxVal = b;
            int minVal = a/2;
            System.out.println(maxVal+" "+minVal);
        }
        else
        {
            int maxVal = a;
            int minVal = b/2;
            System.out.println(maxVal+" "+minVal);
        }

    }
}
